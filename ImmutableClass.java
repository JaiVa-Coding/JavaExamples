package JavaExamples;

 final class ImmutableClass {

    private String name;
    private int age;

    ImmutableClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    class CallingIMmutable {
 

        public static void main(String[] args) {
            ImmutableClass immutable = new ImmutableClass("Kiran", 28);
            System.out.println("Name is " + immutable.getName());
            System.out.println("Age is" + immutable.getAge());

        }
     



    }
}
