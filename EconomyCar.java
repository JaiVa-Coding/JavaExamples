package JavaExamples;

public class EconomyCar implements CarInterface{

    @Override
    public void model() {
        // TODO Auto-generated method stub
    System.out.println("Honda Civic");
    }

    @Override
    public void power() {
        // TODO Auto-generated method stub
        System.out.println("200 HorsePower");
    }

    public static void main(String[] args) {
        EconomyCar honda = new EconomyCar();
        honda.model();
        honda.power();
    }

}
