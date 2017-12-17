/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author ChiuSing
 */
public class Reference {

    private RatingRegister rr;

    public Reference(RatingRegister rr) {
        this.rr = rr;
    }

    public Film recommendFilm(Person person) {

        Map<Film, Rating> pmap = rr.getPersonalRatings(person);
        if (pmap.size() == 0) {
            Map<Film, List<Rating>> fr = rr.filmRatings();
            List<Film> fl = new ArrayList<Film>(fr.keySet());
            Collections.sort(fl, new FilmComparator(fr));
            return fl.get(0);
        }
        List<Person> reviewers = rr.reviewers();
        reviewers.remove(person);
        int index = 0;
        int bestSim = -99;
        for (int i = 0; i < reviewers.size(); i++) {
            Person p1 = reviewers.get(i);
            int similarity = 0;
            for (Map.Entry<Film, Rating> e : pmap.entrySet()) {
                if (rr.getRating(p1, e.getKey()) != Rating.NOT_WATCHED) {
                    similarity += rr.getRating(p1, e.getKey()).getValue() * e.getValue().getValue();
                }
            }
            if (similarity > bestSim) {
                bestSim = similarity;
                index = i;
            }
        }
        Map<Film, Rating> fr = rr.getPersonalRatings(reviewers.get(index));
        Rating best = Rating.BAD;
        for (Map.Entry<Film, Rating> e : fr.entrySet()) {
            if (!pmap.containsKey(e.getKey())) {
                best = e.getValue().getValue() > best.getValue() ? e.getValue() : best;
            }
        }
        if (best.getValue() <= 0) {
            return null;
        }
        for (Map.Entry<Film, Rating> e : fr.entrySet()) {
            if (!pmap.containsKey(e.getKey()) && e.getValue() == best) {
                return e.getKey();
            }
        }
        return null;

//        Map<Film, List<Rating>> fr = rr.filmRatings();
//        List<Film> fl = new ArrayList<Film>(fr.keySet());
//        Collections.sort(fl, new FilmComparator(fr));
//        return fl.get(0);
    }
}
