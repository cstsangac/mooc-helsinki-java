/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author ChiuSing
 */
public class RatingRegister {

    private Map<Film, List<Rating>> map = new HashMap<Film, List<Rating>>();
    private Map<Person, Map<Film, Rating>> pmap = new HashMap<Person, Map<Film, Rating>>();

    public RatingRegister() {
    }

    public void addRating(Film film, Rating rating) {
        if (map.containsKey(film)) {
            map.get(film).add(rating);
        } else {
            map.put(film, new ArrayList<Rating>());
            map.get(film).add(rating);
        }
    }

    public List<Rating> getRatings(Film film) {
        if (map.containsKey(film)) {
            return map.get(film);
        } else {
            return null;
        }
    }

    public Map<Film, List<Rating>> filmRatings() {
        return map;
    }

    public void addRating(Person person, Film film, Rating rating) {
        addRating(film, rating);
        if (pmap.containsKey(person)) {
            pmap.get(person).put(film, rating);
        } else {
            pmap.put(person, new HashMap<Film, Rating>());
            pmap.get(person).put(film, rating);
        }
    }

    public Rating getRating(Person person, Film film) {
        if (pmap.containsKey(person) && pmap.get(person).containsKey(film)) {
            return pmap.get(person).get(film);
        } else {
            return Rating.NOT_WATCHED;
        }
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (pmap.containsKey(person)) {
            return pmap.get(person);
        } else {
            return new HashMap<Film, Rating>();
        }
    }
    public List<Person> reviewers(){
        return new ArrayList<Person>(pmap.keySet());
    }
}
