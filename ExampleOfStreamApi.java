import java.util.ArrayList;
import java.util.stream.Collectors;

public class ExampleOfStreamApi {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(18);
        list.add(19);
        list.add(16);
        list.add(46);
        list.add(23);
        list.add(9);
        list.add(12);

//        ArrayList of integers and filter all even numbers using Streams.

        System.out.println("Original List ");
        list.forEach(n-> System.out.print(n + " "));
        System.out.println();
        ArrayList<Integer> newList = list.stream()
                .filter(n-> n%2==0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("New List With Even Numbers Only ");
        newList.forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println();


//        ArrayList of strings and use Streams to find all strings that start with the letter 'A'.

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Abhay");
        list2.add("Yusuf");
        list2.add("Faizan");
        list2.add("Talib");
        list2.add("Zohaib");
        list2.add("Adnan");

        System.out.println("Original list");
        list2.forEach(n-> System.out.print(n + " "));
        System.out.println();

        ArrayList<String> newList2 = list2.stream()
                .filter(n-> n.startsWith("A"))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("List of names that starts with A");
        newList2.forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println();



//        program to find the first element in an ArrayList greater than 10 using Streams.

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(8);
        list3.add(9);
        list3.add(16);
        list3.add(46);
        list3.add(23);
        list3.add(9);
        list3.add(12);
        Integer result = list3.stream().filter(n-> n>10).findFirst().orElse(null);
        System.out.println(result);




    }
}
