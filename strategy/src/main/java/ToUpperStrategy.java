public class ToUpperStrategy implements ChangeTextStrategy {
    public String changeText(String text) {
        return text.toUpperCase();
    }
}
