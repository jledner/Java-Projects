public class Circle implements Shape{
    private double radius;
    public Circle (double r){
        this.radius = r;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * this.radius;
    }
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
}