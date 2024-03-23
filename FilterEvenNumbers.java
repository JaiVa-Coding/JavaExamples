package JavaExamples;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumbers {
    public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1,2,5,7,14);

    numbers.stream().filter(n -> n % 2 == 0).forEach(i -> System.out.println(i));
    numbers.stream().map(e -> e * 3).forEach(e -> System.out.println(e));

    

    }
}
