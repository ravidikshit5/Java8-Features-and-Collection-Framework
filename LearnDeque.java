import java.util.ArrayDeque;

public class LearnDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(10);
        dq.addFirst(20);
        dq.addLast(30);
        System.out.println(dq);
    }
}
