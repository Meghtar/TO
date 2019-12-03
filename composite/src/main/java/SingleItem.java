public class SingleItem implements Component{
    private float price;
    private String name;

    public float getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public SingleItem(float price, String name) {
        this.price = price;
        this.name = name;
    }
}
