public class Animal {
    private String name;
    public Animal(String name){
        this.name = name;

    }
    @Override
    public String toString(){
        return String.format("Anima[name=\"%s\"]", this.name);
    }
}
