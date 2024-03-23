package JavaExamples;

public class Employee {

    int id;
    String firstname;
    int salary;
    Gender gender;

    // Constructor sets firstName and lastName
    public Employee(int idd, String fname, Gender gender, int fs)
    {
      this.id = idd;
      this.firstname = fname;
      this.salary = fs;
      this.gender = gender;
    }
  
}
