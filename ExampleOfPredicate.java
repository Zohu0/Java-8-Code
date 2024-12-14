import java.util.function.Predicate;

public class ExampleOfPredicate {
    public static void main(String[] args) {

        // Program to check armstrong number

        Predicate<Integer> armstrongNumber = (n) -> {
            int originalNumber = n;
            int size = String.valueOf(n).length();
            double result = 0;
            while (n>0){
                double digit = n % 10;
                result = result + Math.pow(digit,size);
                n = n/10;
            }

            return result==originalNumber;
        };


        System.out.println(armstrongNumber.test(153));

    }
}
