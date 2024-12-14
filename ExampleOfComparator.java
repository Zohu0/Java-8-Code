import java.util.ArrayList;


class Student {

    String name;
    int percentage;

    Student(String name, int percentage){
        this.name = name;
        this.percentage = percentage;
    }

    @Override
    public String toString(){
        return name + " : " + percentage + "% ";
    }
}

public class ExampleOfComparator {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("Zohaib", 82));
        list.add(new Student("Talib", 83));
        list.add(new Student("Yusuf", 91));
        list.add(new Student("Faizan", 99));
        list.add(new Student("Abhay", 56));

        System.out.println("Original List");
        System.out.println(list);

        // Increasing Order
        System.out.println("Increasing order according to percentage");
        list.sort((e1, e2) -> Integer.compare(e1.percentage, e2.percentage));
        System.out.println(list);

        // Decreasing Order
        System.out.println("Decreasing order according to percentage");
        list.sort((e1, e2) -> Integer.compare(e2.percentage, e1.percentage));
        System.out.println(list);

    }
}
