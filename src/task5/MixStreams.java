package task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import java.util.Collections;

public class MixStreams {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();
        List<T> mixedList = new ArrayList<>();

        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            mixedList.add(firstIterator.next());
            mixedList.add(secondIterator.next());
        }

        Collections.shuffle(mixedList);
        return mixedList.stream();

    }
}
