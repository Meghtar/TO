import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandTest {

    @Test
    void TurnOnFanTest() {
        Fan fan = new Fan();
        Button button = new Button();
        Command turnOn = new TurnOnCommand(fan);

        button.setCommand(turnOn);

        button.press();

        assertEquals(true,fan.getStatus());
    }

    @Test
    void TurnOffFanTest() {
        Fan fan = new Fan();
        Button button = new Button();
        Command turnOff = new TurnOffCommand(fan);

        button.setCommand(turnOff);

        button.press();

        assertEquals(false,fan.getStatus());
    }
}
