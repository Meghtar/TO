public class Button {
    private Command command = null;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void press() {
        if(command != null)
            command.execute();
    }
}
