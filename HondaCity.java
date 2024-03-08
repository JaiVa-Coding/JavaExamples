package JavaExamples;

public class HondaCity extends ConcreteClass{ 

    HondaCity(String engine, int numberOfDoors) {
        super(engine, numberOfDoors);
    }

    public static void main(String[] args) {


        
        ConcreteClass hondaCity = new ConcreteClass("Mercedes", 4);
     

        System.out.println(hondaCity.engine);
        System.out.println(hondaCity.numberOfDoors);
        System.out.println(hondaCity.color("red"));
    }

  

}
