package streams;

import static streams.DummyMovieStream.movies;

public class DemoFilter {
    static void main() {
        movies.stream()
                .filter(movie -> movie.getLikes()>1)
                .forEach(movie -> System.out.println(movie.getName()));
    }
}
