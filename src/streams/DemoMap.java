package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static streams.DummyMovieStream.movies;

public class DemoMap {
    static void main() {
        movies.stream()
                .map(movie -> movie.getName())
                .forEach(movie -> System.out.println(movie));

        var str = Stream.of(List.of(1,2,3),List.of(4,5,6));
        str
                .forEach(list -> System.out.println(list));

        var str2 = Stream.of(List.of(1,2,3),List.of(4,5,6));
        str2
                .flatMap(list->list.stream())
                .forEach(list-> System.out.println(list));
    }
}
