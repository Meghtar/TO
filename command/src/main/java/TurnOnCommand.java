public class TurnOnCommand implements Command {
    private Fan fan;

    public TurnOnCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.TurnOn();
    }
}
