public class Rectangle implements Shape{
    private double width;
    private double height;
    public Rectangle (double w, double h){
        this.width = w;
        this.height = h;
    }
    @Override
    public double getArea(){
        return this.width * this.height;
    }
    @Override
    public double getPerimeter(){
        return 2*width + 2*height;
    }
}
