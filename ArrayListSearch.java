import java.util.ArrayList;

public class ArrayListSearch {

public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    numbers.add(1);
    numbers.add(3);
    numbers.add(5);
    numbers.add(15);
    numbers.add(25);
    numbers.add(35);
    numbers.add(41);
    numbers.add(57);

    //Iterating with for each

    for(int i: numbers) {
        System.out.println(i);
    }

    //iterating with streams
    numbers.forEach(number -> System.out.println(number));

}
}
