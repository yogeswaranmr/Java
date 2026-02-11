package streams;

import java.util.List;

public class DummyMovieStream {
    public static List<DummyMovie> movies = List.of(
            new DummyMovie("a",1),
            new DummyMovie("b",2),
            new DummyMovie("c",3)
        );
}
