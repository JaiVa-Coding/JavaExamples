package JavaExamples;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

    public static void main(String[] args) {

        String[] names = {"Chaitanya","Vinay", "Chaitanya", "Kiran", "Lokesh", "Kiran"};

        Set<String> nameSet = new HashSet<String>();
        for(String name: names) {
            if(nameSet.add(name) == false) {
                System.out.println("Duplicate Element: " + name);
            }
        }
        


    }

}
