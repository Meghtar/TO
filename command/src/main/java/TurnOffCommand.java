public class TurnOffCommand implements Command {
    private Fan fan;

    public TurnOffCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.TurnOff();
    }
}
