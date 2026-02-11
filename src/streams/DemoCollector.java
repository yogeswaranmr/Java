package streams;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static streams.DummyMovieStream.movies;

public class DemoCollector {
    static void main() {
        List<Integer> likesList = movies.stream()
                .map(movie -> movie.getLikes())
                .collect(toList());
        System.out.println(likesList);
    }
}
