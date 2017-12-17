/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author ChiuSing
 */
public class FilmComparator implements Comparator<Film> {

    private Map<Film, List<Rating>> ratings = new HashMap<Film, List<Rating>>();

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    @Override
    public int compare(Film t, Film t1) {
        double avg = 0;
        for(Rating r:ratings.get(t)){
            avg += r.getValue();
        }
        avg /= ratings.get(t).size();
        
        double avg1 = 0;
        for(Rating r:ratings.get(t1)){
            avg1 += r.getValue();
        }
        avg1 /= ratings.get(t1).size();
        
        int x = (int)(avg1 - avg);
        return x;
    }

}
