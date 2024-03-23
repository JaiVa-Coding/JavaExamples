package JavaExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapWithStreams {

    public static void main(String[] args) {

        List<String> list1= Arrays.asList("Chaitanya", "Kiran", "Vinay");

        List<String> list2 = Arrays.asList("Apples", "Oranges", "Grapes");
        List<String> list3 = Arrays.asList("Tomatoes", "Cucumbers", "Onions");
    

      

        Stream<String> firStream = Stream.concat(list1.stream(), list2.stream());
        Stream<String> finalStream = Stream.concat(firStream, list3.stream());
        finalStream.forEach(i -> System.out.println(i));

        

        
        

    }
    

}
