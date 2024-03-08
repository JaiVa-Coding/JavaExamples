package JavaExamples;

public class SportsCar implements CarInterface{

    @Override
    public void model(){
        // TODO Auto-generated method stub
       System.out.println("Audi R8");
    }

    @Override
    public void power() {
        // TODO Auto-generated method stub
    System.out.println("600 HorsePower");
    }

    public static void main(String[] args) {

        SportsCar audi = new SportsCar();
        audi.model();
        audi.power();

        
    }

}
