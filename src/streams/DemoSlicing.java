package streams;

import static streams.DummyMovieStream.movies;

public class DemoSlicing {
    static void main() {
        System.out.println("skip():");
        movies.stream()
                .skip(2)
                .forEach(movie -> System.out.println(movie.getName()));

        System.out.println("limit():");
        movies.stream()
                .limit(2)
                .forEach(movie -> System.out.println(movie.getName()));

        System.out.println("takeWhile():");
        // once a value in stream fails, this breaks
        movies.stream()
                .takeWhile(movie -> movie.getLikes()<2)
                .forEach(movie -> System.out.println(movie.getName()));

        System.out.println("dropWhile():");
        // once a value in stream fails, this starts
        movies.stream()
                .dropWhile(movie -> movie.getLikes()<2)
                .forEach(movie -> System.out.println(movie.getName()));
    }
}
