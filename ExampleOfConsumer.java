import java.util.*;
import java.util.function.Consumer;

public class ExampleOfConsumer {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Zohaib");
        names.add("Yusuf");
        names.add("Asim");

        Consumer<String> printName = name -> System.out.println(name);

        names.forEach(printName);
    }
}
