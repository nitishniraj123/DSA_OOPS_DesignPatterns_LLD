package LLD.BookMyShow.Model;

import LLD.BookMyShow.enums.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheaterController {

    Map<City, List<Theater>> cityVsTheatre;
    List<Theater> allTheatre;

    public TheaterController() {
        cityVsTheatre = new HashMap<>();
        allTheatre = new ArrayList<>();
    }

    public void addTheatre(Theater theatre, City city) {

        allTheatre.add(theatre);

        List<Theater> theatres = cityVsTheatre.getOrDefault(city, new ArrayList<>());
        theatres.add(theatre);
        cityVsTheatre.put(city, theatres);
    }


    public Map<Theater, List<Show>> getAllShow(Movie movie, City city) {

        //get all the theater of this city

        Map<Theater, List<Show>> theatreVsShows = new HashMap<>();

        List<Theater> theatres = cityVsTheatre.get(city);

        //filter the theatres which run this movie

        for(Theater theatre : theatres) {

            List<Show> givenMovieShows = new ArrayList<>();
            List<Show> shows = theatre.getShows();

            for(Show show : shows) {
                if(show.movie.getMovieId() == movie.getMovieId()) {
                    givenMovieShows.add(show);
                }
            }
            if(!givenMovieShows.isEmpty()) {
                theatreVsShows.put(theatre, givenMovieShows);
            }
        }

        return theatreVsShows;
    }
}


