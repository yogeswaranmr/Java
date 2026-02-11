package streams;

import javax.swing.text.html.Option;
import java.util.Optional;

import static streams.DummyMovieStream.movies;

public class DemoReduce {
    static void main() {
        Optional<Integer> sum = movies.stream()
                .map(movie -> movie.getLikes())
                .reduce((acc, val) -> acc+val);
        System.out.println(sum);
        System.out.println(sum.orElse(0));

        int sum2 = movies.stream()
                .map(movie -> movie.getLikes())
                .reduce(0,Integer::sum);
        System.out.println(sum2);
    }
}