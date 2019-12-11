public class SticknoteType {
    private String color;
    private int width;
    private int height;

    public SticknoteType(String color, int width, int height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public String getSticknote(String note) {
        return width + "x" + height + " " + color + " " + note;
    }
}
