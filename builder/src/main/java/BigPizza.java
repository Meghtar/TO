public class BigPizza {

    private final String meat;
    private final String cheese;
    private final String dough;
    private final String topping;
    private final String name;

    public BigPizza(String meat, String cheese, String dough, String topping, String name) {
        this.meat = meat;
        this.cheese = cheese;
        this.dough = dough;
        this.topping = topping;
        this.name = name;
    }

    public String printPizza() {
        String pizza = "";
        pizza += "Size: Big\n";
        pizza += "Name:" + name + "\n";
        pizza += "Cheese: " + cheese + "\n";
        pizza += "Dough: " + dough + "\n";
        pizza += "Topping: " + topping + "\n";
        return pizza;
    }
}
