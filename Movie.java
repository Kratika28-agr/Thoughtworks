package com.prograd;

public class Movie {
    private final String title;
    private final String studio;
    private final String rating;

    public  Movie( String title, String studio,String rating){
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static Movie[] getPg(Movie[] movies) {
        Movie[] pgMovies = new Movie[movies.length];
        int count = 0;
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                pgMovies[count] = movie;
                count += 1;
            }
        }
        return pgMovies;
    }
}

class MainMovie{
    public static void main(String[] args) {
        Movie m = new Movie("Casino Royal", "Eon Productions", "PG-13");
    }


}
