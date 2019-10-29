import factory.BlueOfficeItemFactory;
import factory.GreenOfficeItemFactory;
import factory.OfficeItemFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractFactoryTest {
    @Test
    void CreatingBluePenTest(){
        OfficeItemFactory blueItemsFactory = new BlueOfficeItemFactory();

        Customer customer = new Customer(blueItemsFactory);

        assertEquals("blue pen", customer.getPenInfo());
    }

    @Test
    void CreatingGreenNotebook() {
        OfficeItemFactory greenItemsFactory = new GreenOfficeItemFactory();

        Customer customer = new Customer(greenItemsFactory);

        assertEquals("green notebook", customer.getNotebookInfo());
    }
}
