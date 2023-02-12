public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){}
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width,double length, String color, boolean filled){
//        super(color, filled);
//        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        return
                this.length*this.width;
    }
    public double getPerimeter(){
        return 2*(this.length+this.width);
    }
    public String toString(){
        return String.format("A Rectangle with width = %.2f and length = %.2f, which is a subclass of %s", this.width, this.length,
                super.toString());
//        return String.format("A Circle with radius = %s, which is a subclass of %s", )
    }
}
