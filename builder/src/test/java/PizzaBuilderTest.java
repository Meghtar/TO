import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

// TODO: director
// TODO: client

public class PizzaBuilderTest {

    @Test
    public void shouldPass() {
        assertEquals(true, true);
    }

    @Test
    public void bigMargharitaTest() {
        Director director = new Director();

        PizzaBuilder builder = new BigPizzaBuilder();

        director.constructMargherita(builder);

        BigPizza pizza =  ((BigPizzaBuilder) builder).getResult();
        String out = pizza.printPizza();

        assertNotEquals(out.indexOf("Margherita"), -1);
        assertNotEquals(out.indexOf("Big"), -1);
        assertNotEquals(out.indexOf("Thin"), -1);
        assertNotEquals(out.indexOf("Tomatoes"), -1);
    }

    @Test
    public void smallCapricciosaTest() {
        Director director = new Director();

        PizzaBuilder builder = new SmallPizzaBuilder();

        director.contructCapricciosa(builder);

        SmallPizza pizza =  ((SmallPizzaBuilder) builder).getResult();
        String out = pizza.printPizza();

        assertNotEquals(out.indexOf("Capricciosa"), -1);
        assertNotEquals(out.indexOf("Small"), -1);
        assertNotEquals(out.indexOf("Thick"), -1);
        assertNotEquals(out.indexOf("Mozarella"), -1);
    }

}
