package JavaExamples;

public class StringOperations {

    public static void main(String[] args) {

            //String Buffer
    StringBuffer sb = new StringBuffer();
    sb.append("Hello");
    sb.append(" ");
    sb.append("my name is ");
    sb.append("Chaitanya");
    String message = sb.toString();
    System.out.println(message);

    sb.replace(0,5, "Bye");
    System.out.println(sb);

    sb.delete(0,3);
    System.out.println(sb);


    //Length of String
    System.out.println(sb.length());

    //String Builder
    StringBuilder str = new StringBuilder();
    str.append("Hi");
    StringBuilder str1 = new StringBuilder("Bye");
    StringBuilder str2 = new StringBuilder(str1.toString());

    System.out.println(str);
    System.out.println(str1);
    System.out.println(str2);

    }

}
