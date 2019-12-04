public class Circle extends Shape {
    public String getShapeInfo() {
        return this.color.getColor() + " circle";
    }

    Circle(Color color){
        super(color);
    }
}
