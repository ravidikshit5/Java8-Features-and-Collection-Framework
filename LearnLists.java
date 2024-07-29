import java.util.ArrayList;
import java.util.List;

public class LearnLists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.size());
        list2.addAll(list);
        System.out.println(list2);


    }
}
