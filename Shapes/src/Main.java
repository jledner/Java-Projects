public class Main{
    public static void main (String[] args){
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(10, 12);
        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Circle Perimeter: " + c.getPerimeter());
        System.out.println("Rectangle Area: " + r.getArea());
        System.out.println("Rectangle Perimeter: " + r.getPerimeter());
    }
}