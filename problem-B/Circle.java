public class Circle extends  Shape{
    private double radius= 1.0;
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
//        super(color, filled);
//        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getPerimeter(){
        return Math.PI*this.radius*2;
    }
    @Override
    public String toString(){
      return String.format("A Circle with radius = %.2f, which is a subclass of %s", this.radius,
                super.toString());
    }

}
