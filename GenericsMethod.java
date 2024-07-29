public class GenericsMethod {
    public static void main(String[] args) {
        getData("Hello");
        getData(123);
    }
//    static void getData(String data){
//        System.out.println(data);
//    }
    //if we want to print any type of data simply we have to make the generic methods
     static <E> void getData(E data){
         System.out.println(data);
     }
}
