import java.util.function.Supplier;

public class ExampleOfSupplier {

    public static void main(String[] args) {
        Supplier<Integer> fibonacciSequence = new Supplier<>() {
            int prev = 0;
            int current = 1;

            @Override
            public Integer get() {
                int next = prev + current;
                prev = current;
                current = next;
                return prev;
            }
        };

        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacciSequence.get());
        }
    }
}
