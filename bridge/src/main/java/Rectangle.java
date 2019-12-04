public class Rectangle extends Shape {
    public String getShapeInfo() {
        return this.color.getColor() + " rectangle";
    }

    Rectangle(Color color){
        super(color);
    }
}
