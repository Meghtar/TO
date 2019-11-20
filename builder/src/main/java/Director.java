public class Director {
    public void constructMargherita(PizzaBuilder builder) {
        builder.setMeat("None");
        builder.setCheese("Mozarella");
        builder.setDough("Thin");
        builder.setPizzaTopping("Tomatoes");
        builder.setPizzaName("Margherita");
    }

    public void contructCapricciosa(PizzaBuilder builder) {
        builder.setMeat("Prosciutto di Parma");
        builder.setCheese("Mozarella");
        builder.setDough("Thin");
        builder.setPizzaTopping("Olives");
        builder.setPizzaName("Capricciosa");
    }

}
