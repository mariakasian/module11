package task4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomizerStream {
    public static void main(String[] args) {
        Randomizer r = new Randomizer(25214903917l, (long) Math.pow(2, 48));
        r.withSeed(11);

        Stream<Integer> stream = Stream.iterate(11, (seed) -> r.withSeed(seed).nextRandom());
        stream.filter(i -> i > 0)
                .filter(i -> i < 50)
                .limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
