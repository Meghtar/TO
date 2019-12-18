public class Fan {
    private boolean isOn;

    public void TurnOn() {
        isOn = true;
    }

    public void TurnOff() {
        isOn = false;
    }

    public boolean getStatus() {
        return isOn;
    }
}
