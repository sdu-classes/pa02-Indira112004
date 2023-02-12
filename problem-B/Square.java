public class Square extends Rectangle{
    public Square(){

    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);

    }
    public double getSide(){
        return this.getWidth();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setWidth(double side){
        this.setWidth(side);
       // this.setLength(side);
    }
    @Override
    public void setLength(double side){
        this.setWidth(side);
        //this.setLength(side);
    }
    @Override
    public String toString(){
        return String.format("Square[%s]", super.toString());

    }

}
