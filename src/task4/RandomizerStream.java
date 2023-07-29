package task4;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

public class RandomizerStream {
    public static Stream<Long> randomStream(long seed, long a, long c, long m) {
        AtomicLong x = new AtomicLong(seed);

        return Stream.iterate(seed, n -> {
            long nextRandom = (a * x.getAndSet(n) + c) % m;
            return nextRandom;
        });
    }
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48);
        long seed = 1L;

        randomStream(seed, a, c, m)
                .filter(i -> i > 0)
                .filter(i -> i < 50)
                .limit(10)
                .forEach(System.out::println);
    }
}
