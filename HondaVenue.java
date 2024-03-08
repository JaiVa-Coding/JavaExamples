package JavaExamples;

public class HondaVenue extends ConcreteClass{

    HondaVenue(String engine, int numberOfDoors) {
        super(engine, numberOfDoors);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        
    ConcreteClass hondaVenue = new ConcreteClass("BMW", 5);
    System.out.println(hondaVenue.engine);
    System.out.println(hondaVenue.numberOfDoors);
    System.out.println(hondaVenue.color("blue"));

    }

  @Override
     String color(String color) {
        return color;
    }
    


    

}
