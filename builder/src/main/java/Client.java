public class Client {
    Director director = new Director();

    PizzaBuilder builder = new BigPizzaBuilder();

    director.constructMargherita(builder);
}
