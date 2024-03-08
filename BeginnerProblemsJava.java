import java.util.Scanner;

public class BeginnerProblemsJava {

    //Read 3 integers from the input and post each in a different line

    public static void main(String[] args) {
/* 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

       */

        //if-else-if example

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if(n%2!=0) {
            System.out.println("Weird");

        } else if (n>=2 && n<=5) {
            System.out.println("Not Weird");

        } else if (n >= 6 && n <=20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }


        }

    }

    

