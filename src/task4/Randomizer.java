package task4;

import java.util.concurrent.atomic.AtomicLong;
public class Randomizer {
        private long a, c, m;
        private AtomicLong x;

        public Randomizer(long a, long m) {
            this.a = a;
            this.m = m;
        }

        public Randomizer withSeed(long c) {
            this.c = c;
            x = new AtomicLong(c);
            return this;
        }

        public int nextRandom() {
            x.set((a * x.get() + c) % m);
            return (int) x.get();
        }
    }

