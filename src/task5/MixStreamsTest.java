package task5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MixStreamsTest {
    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(1, 2, 3);
        Stream<Integer> second = Stream.of(4, 5, 6);
        MixStreams mix = new MixStreams();
        Stream<Pair<Integer, Integer>> resultStream = mix.zip(first, second);
        resultStream.forEach(pair -> System.out.println(pair.getFirst() + ", " + pair.getSecond()));
    }
}
