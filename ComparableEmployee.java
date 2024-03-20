package JavaExamples;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableEmployee implements Comparable<ComparableEmployee>{

    private int id;
    private String name;
    private int salary;

    @Override
    public int compareTo(ComparableEmployee e) {
      return this.salary - e.salary;
        
    }

    public ComparableEmployee(int idd, String nn, int ns) {
        this.id = idd;
        this.name = nn;
        this.salary = ns;


    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

     class RunComparator {

        public static void main(String[] args) {

            ArrayList<ComparableEmployee> employeelist = new ArrayList<ComparableEmployee>();
            employeelist.add(new ComparableEmployee(1, "Chaitanya", 25000));
            employeelist.add(new ComparableEmployee(2, "Kiran", 500000));
            employeelist.add(new ComparableEmployee(3, "Vivek", 100000));

            Collections.sort(employeelist);

            for(ComparableEmployee employee: employeelist) {
                System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }

        }
    }



    

}
