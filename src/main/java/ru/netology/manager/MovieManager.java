package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {
    private Movie[] movies = new Movie[0];
    private int countMovie;

    public MovieManager(int countMovie) {
        this.countMovie = 10;
    }

    public MovieManager() {
    }

    public void addMovie(Movie movie) {
        int length = movies.length + 1;
        Movie[] mov = new Movie[length];
        System.arraycopy(movies, 0, mov, 0, movies.length);
        int newMovie = mov.length - 1;
        mov[newMovie] = movie;
        this.movies = mov;
    }

    public Movie[] lastMovie(int countMovie) {
        if (movies.length > countMovie) {
            Movie[] result = new Movie[countMovie];
            for (int i = 0; i < result.length; i++) {
                int index = movies.length - i - 1;
                result[i] = this.movies[index];
            }
            return result;
        } else {
            Movie[] result = new Movie[movies.length];
            for (int i = 0; i < result.length; i++) {
                int index = result.length - i - 1;
                result[i] = this.movies[index];
            }
            return result;
        }

    }

}
