public class Dog extends Mammal{
    public String name;
    public Dog(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(Dog another){

        System.out.println("Wooof");
    }
    @Override
    public String toString(){
        return String.format("Dog[%s]", super.toString());
    }
}
