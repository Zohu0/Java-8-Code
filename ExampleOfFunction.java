import java.util.function.Function;

public class ExampleOfFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> square = number -> number*number;
        Function<Integer,Integer> cube =  number -> (int) Math.pow(number, 3);

        System.out.println(square.apply(4));
        System.out.println(cube.apply(3));
    }
}
