public class Cat extends Animal {
    private String color;
    public Cat(String color, String name, int age) {
        super(name, age);
        setColor(color);
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
