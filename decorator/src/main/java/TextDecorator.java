public abstract class TextDecorator implements Text{
    private final Text textToBeDecorated;

    public TextDecorator(Text text) {
        this.textToBeDecorated = text;
    }

    public String getContent() {
        return textToBeDecorated.getContent();
    }
}
