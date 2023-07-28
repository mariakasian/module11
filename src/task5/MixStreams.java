package task5;

import java.util.stream.Stream;

public class MixStreams {
    public static <T> Stream<Pair<T, T>> zip(Stream<T> first, Stream<T> second) {
        return first.flatMap(x -> second.map(y -> new Pair<>(x, y)));
    }
}
