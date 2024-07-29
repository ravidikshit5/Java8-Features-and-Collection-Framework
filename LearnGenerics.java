public class LearnGenerics {
    public static void main(String[] args) {
        Dog d1 = new Dog("ABC-Dog","123");
        Dog d2 = new Dog("CDE-DOG",11);
        //lets a in future if we want to create a dog id which is of int type
        Dog d3 = new Dog(123,2.00);
        System.out.println(d1.name);
        System.out.println(d2.dogId);
        System.out.println(d3.name);
        //Above gives the error to remove this problem we uses the concepts of generics classes
    }
}
class Dog<E,V>{
    E dogId;
    V name;
    Dog(E dogId,V name){
        this.dogId = dogId;
        this.name = name;
    }
}
