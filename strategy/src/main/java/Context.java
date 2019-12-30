public class Context {
    private ChangeTextStrategy strategy;

    public void setStrategy(ChangeTextStrategy strategy) {
        this.strategy = strategy;
    }

    public String getChangedText(String text) {
        return strategy.changeText(text);
    }
}
