import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ravi Dikshit");
        list.add("Juhy Shukla");
        list.add("Priya Upadhyay");
        list.add("Kshama Shukla");
        list.add("Mamta Mishra");
        list.add("Rajeev Dikshit");

        //We can iterate a list through the following methods
        //1. through the for loop
        for(int i=0;i<list.size();i++){
            System.out.println("Family member "+i+" "+list.get(i));
        }

        //through the for each loop
        for(String member:list){
            System.out.println("Famil member is "+member);
        }

        //through the iteratior
        Iterator<String> family = list.iterator();
        while (family.hasNext()){
            System.out.println(family.next());
        }

    }
}
