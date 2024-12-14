@FunctionalInterface
interface Fruit {

    void taste();
}


public class ExampleOfFunctionalInterface {

    public static void main(String[] args) {

        Fruit mango = () -> System.out.println("Mango Is Sweet In Taste..");
        mango.taste();

        Fruit lemon = () -> System.out.println("Lemon Is Sour In Taste..");
        lemon.taste();


    }
}
