package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    private Movie one = new Movie(1, "Film 1", "comedy", "posterFilm1", "25.02.2021");
    private Movie two = new Movie(2, "Film 2", "comedy", "posterFilm2", "28.01.2021");
    private Movie three = new Movie(3, "Film 3", "horror", "posterFilm3", "14.03.2021");
    private Movie four = new Movie(4, "Film 4", "animation", "posterFilm4", "10.09.2021");
    private Movie five = new Movie(5, "Film 5", "comedy", "posterFilm5", "27.10.2021");
    private Movie six = new Movie(6, "Film 6", "fantasy", "posterFilm6", "21.09.2021");
    private Movie seven = new Movie(7, "Film 7", "melodrama", "posterFilm7", "09.07.2020");
    private Movie eight = new Movie(8, "Film 8", "drama", "posterFilm8", "02.02.2021");
    private Movie nine = new Movie(9, "Film 9", "animation", "posterFilm9", "20.06.2021");
    private Movie ten = new Movie(10, "Film 10", "horror", "posterFilm10", "08.01.2022");
    private Movie eleven = new Movie(11, "Film 11", "thriller", "posterFilm11", "15.09.2021");
    private Movie twelve = new Movie(12, "Film 12", "musical", "posterFilm12", "17.02.2021");
    private Movie thirteen = new Movie(13, "Film 13", "fantasy", "posterFilm13", "02.07.2021");
    private Movie fourteen = new Movie(14, "Film 14", "action", "posterFilm14", "04.12.2021");
    private Movie fifteen = new Movie(15, "Film 15", "comedy", "posterFilm15", "13.05.2020");


    @Test
    public void lastMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);
        manager.addMovie(eleven);
        manager.addMovie(twelve);
        Movie[] actual = manager.lastMovie(10);
        Movie[] expected = new Movie[]{twelve, eleven, ten, nine, eight, seven, six, five, four, three};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void lastMoviefor5movie() {
        MovieManager manager = new MovieManager();
        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);
        manager.addMovie(eleven);
        manager.addMovie(twelve);
        manager.addMovie(thirteen);
        manager.addMovie(fourteen);
        manager.addMovie(fifteen);
        Movie[] actual = manager.lastMovie(5);
        Movie[] expected = new Movie[]{fifteen, fourteen, thirteen, twelve, eleven};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void lastMovielessthan10movie() {
        MovieManager manager = new MovieManager();
        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        Movie[] actual = manager.lastMovie(10);
        Movie[] expected = new Movie[]{six, five, four, three, two, one};
        assertArrayEquals(expected, actual);
    }

}