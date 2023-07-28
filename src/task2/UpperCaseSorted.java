package task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseSorted {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ivan", "Maria", "Olga", "Peter", "Max",
                "Vova", "Ira", "Oleg", "Katia", "Ruslan");
        UpperCaseSorted us = new UpperCaseSorted();
        List<String> result = us.upperSorted(list);
        System.out.println(result);
    }

    public List<String> upperSorted(List<String> list) {
        return list.stream()
                .map(a -> a.toUpperCase())
                .sorted((e1, e2) -> (e2.compareTo(e1) - e1.compareTo(e2)))
                .collect(Collectors.toList());
    }
}
