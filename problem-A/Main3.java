import java.util.Scanner;

public class Main3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Animal animal = new Animal("Rat");
        System.out.println(animal);
        Mammal mammal = new Mammal("Whale");
        System.out.println(mammal);
        Cat cat = new Cat("Felix");
        cat.greets();
        System.out.println(cat);
        Dog d = new Dog("Aktos");
        Dog d2 = new Dog("K9");
        d.greets();
        d.greets(d2);
        System.out.println(d);
        System.out.println(d2);
    }
}
