package JavaExamples;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeOperations {

    public static void main(String[] args) {
        Employee employee[] = new Employee[6];
        employee[0] = new Employee(1, "Chaitanya", Gender.MALE, 25000);
        employee[1] = new Employee(2, "Kiran",Gender.MALE, 35000);
        employee[2] = new Employee(3, "Bhargavi",Gender.MALE, 60000);
        employee[3] = new Employee(4, "Vinay",Gender.MALE, 50000);
        employee[4] = new Employee(4, "Vijay",Gender.MALE, 55000);
        employee[5] = new Employee(4, "Rama",Gender.FEMALE, 50000);

        Stream<Employee> stream = Arrays.stream(employee);
        long totalMales = stream.filter(m -> m.gender.equals(Gender.MALE)).count();
        long totalFemales = stream.filter(f -> f.gender.equals(Gender.FEMALE)).count();

        System.out.println("Number of males are " + totalMales);
        System.out.println("Number of females are " + totalFemales);

        

    }




}
