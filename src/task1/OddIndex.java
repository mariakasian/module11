package task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddIndex {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ivan", "Maria", "Olga", "Peter", "Max",
                "Vova", "Ira", "Oleg", "Katia", "Ruslan");
        OddIndex oddIndex = new OddIndex();
        String result = oddIndex.odd(list);
        System.out.println(result);
    }

    public String odd(List<String> list) {
        List<String> stream = IntStream.range(0, list.size())
                .filter((int i) -> i % 2 != 0)
                .mapToObj(i -> i + ". " + list.get(i))
                .collect(Collectors.toList());
         String str = String.join(", ", stream);
         return str;
    }
}