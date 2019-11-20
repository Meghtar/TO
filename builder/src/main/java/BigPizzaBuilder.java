public class BigPizzaBuilder implements PizzaBuilder {
    private String meat;
    private String cheese;
    private String dough;
    private String topping;
    private String name;

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setPizzaTopping(String topping) {
        this.topping = topping;
    }
    public void setPizzaName(String name) {
        this.name = name;
    }

    public BigPizza getResult() {
        return new BigPizza(meat, cheese, dough, topping, name);
    }
}
