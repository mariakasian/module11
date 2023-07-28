package task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddIndex {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1. Ivan", "2. Maria", "3. Olga", "4. Peter", "5. Max",
                "6. Vova", "7. Ira", "8. Oleg", "9. Katia", "10. Ruslan");
        OddIndex oddIndex = new OddIndex();
        List<String> result = oddIndex.odd(list);
        System.out.println(result);
    }

    public List<String> odd(List<String> list) {
        return IntStream.range(0, list.size())
                .filter((int n) -> n % 2 == 0)
                .mapToObj(list::get)
                .collect(Collectors.toList());
    }
}