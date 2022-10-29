import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 3);
        List<Integer> squares = numbers.stream().map(x -> x*x).collect(Collectors.toList());
        for (Integer x : squares) {
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println();

        List<String> names = Arrays.asList("Reflection", "Sajjad", "Collection", "Stream");
        List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        for (String s : result) {
            System.out.print(s);
            System.out.print(" ");
        }
        System.out.println();

        result = names.stream().sorted().collect(Collectors.toList());
        for (String s : result) {
            System.out.print(s);
            System.out.print(" ");
        }
        System.out.println();


        Set<Integer> squareSet = numbers.stream().map(x -> x*x).collect(Collectors.toSet());
        for (Integer x : squareSet) {
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println();

        numbers.stream().map(x -> x*2).forEach(y -> System.out.println(y));

        int evenSum = numbers.stream().filter(x -> x%2 == 0).reduce(0, (ans, i) -> ans + i);
        int oddSum = numbers.stream().filter(x -> x%2 == 1).reduce(0, (ans, i) -> ans + i);
        System.out.println("evenSum: " + evenSum);
        System.out.println("oddSum: " + oddSum);

        int evenCount = numbers.stream().filter(x -> x%2 == 0).reduce(0, (ans, i) -> ans + 1);
        int oddCount = numbers.stream().filter(x -> x%2 == 1).reduce(0, (ans, i) -> ans + 1);
        System.out.println("evenCount: " + evenCount);
        System.out.println("oddCount: " + oddCount);
    }
}
