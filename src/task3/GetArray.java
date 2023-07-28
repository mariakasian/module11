package task3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class GetArray {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        GetArray ga = new GetArray();
        System.out.println(ga.getArray(array));
    }

    public String getArray(String[] array) {
        String result = Arrays.stream(array)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .mapToInt(Integer::parseInt)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

        return result;
    }
}
