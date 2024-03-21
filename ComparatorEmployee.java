package JavaExamples;

import java.util.Comparator;

public class ComparatorEmployee implements Comparator<ComparatorEmployee>{

    int id;
    String firstname;
    String lastname;
  
    // Constructor sets firstName and lastName
    public ComparatorEmployee(int idd, String fname, String lname)
    {
      this.id = idd;
      this.firstname = fname;
      this.lastname = lname;
    }
  
    // User-friendly output when printed.
    public String toString()
    {
      return "( " + id + ", " + firstname + " " + lastname +  " )";
    }

    @Override
    public int compare(ComparatorEmployee e1, ComparatorEmployee e2) {
        if (e1.lastname.compareTo(e2.lastname) != 0) {
            return e1.lastname.compareTo(e2.lastname);
          } else {
            return e1.firstname.compareTo(e2.firstname);
          }
    }

class RunComparator {


    public static void main(String[] args)
  {
   
    ComparatorEmployee employee[] = new ComparatorEmployee[5];
    employee[0] = new ComparatorEmployee(1, "Chaitanya","Reddy");
    employee[1] = new ComparatorEmployee(2, "Kiran","Kavikondala");
    employee[2] = new ComparatorEmployee(3, "Bhargavi","Reddy");
    employee[3] = new ComparatorEmployee(4, "Vinay","Rao");


    for (int i=0; i < a.length; i++) {
      System.out.println(employee[i]);
    }
  }
}
}
    


