package labEx4.labEx4_1to4;

import java.util.ArrayList;
import java.util.List;

public class LabEx4_1to4 {
    public static void main(String[] args) {
//        ----> Using Array  ---------------------------------------------------------------------------------------------------------
        Movie[] moviesArray = new Movie[6];

        moviesArray[0] = new Movie("Interstellar","Abhishek");
        moviesArray[1] = new Movie("Iron man","MCU","Jon Favreau",130,2008,"Action");
        moviesArray[2] = new SpecialMovie("Inception", "Naa thaa","Naatha","Ithuvu Naatha");
        moviesArray[3] = new SpecialMovie("Iron Man 2","MCU","Jon Favreau",150,2012,"Action","Nane","naan");
        moviesArray[4] = new InternationalMovie("Iron Man 3", "MCU","USA","English");
        moviesArray[5] = new InternationalMovie("Avengers","MCU","Russo Brothers",200,2012,"Action","USA","English");

        for (Movie movie : moviesArray) {
            printMovie(movie);
        }

        System.out.println("Total Movies Created: " + Movie.getMoviesCount());


//        ----> Using List ---------------------------------------------------------------------------------------------------------

        List<Movie> moviesList = new ArrayList<>();

        moviesList.add(new Movie("Interstellar","Abhishek"));
        moviesList.add(new Movie("Iron man","MCU","Jon Favreau",130,2008,"Action"));
        moviesList.add(new SpecialMovie("Inception", "Naa thaa","Naatha","Ithuvu Naatha"));
        moviesList.add(new SpecialMovie("Iron Man 2","MCU","Jon Favreau",150,2012,"Action","Nane","naan"));
        moviesList.add(new InternationalMovie("Iron Man 3", "MCU","USA","English"));
        moviesList.add(new InternationalMovie("Avengers","MCU","Russo Brothers",200,2012,"Action","USA","English"));

        for (Movie movie : moviesList) {
            printMovie(movie);
        }

        System.out.println("Total Movies Created: " + Movie.getMoviesCount());

    }

    private static void printMovie(Movie movie){
        System.out.println(movie.showDetails());

        if (movie instanceof SpecialMovie) {
            SpecialMovie specialMovie = (SpecialMovie) movie;
            System.out.println("Sound Effects: " + specialMovie.getSoundEffects());
            System.out.println("Visual Effects: " + specialMovie.getVisualEffects());
        }

        if (movie instanceof InternationalMovie) {
            InternationalMovie internationalMovie = (InternationalMovie) movie;
            System.out.println("Country: " + internationalMovie.getCountry());
            System.out.println("Language: " + internationalMovie.getLanguage());
        }
        System.out.println();
    }

}
