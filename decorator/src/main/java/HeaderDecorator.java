public class HeaderDecorator extends TextDecorator{

    public HeaderDecorator(Text text) {
        super(text);
    }

    public String getContent() {
        return "[TEXT]" + super.getContent();
    }
}
