public class FooterDecorator extends TextDecorator {

    public FooterDecorator(Text text) {
        super(text);
    }

    public String getContent() {
        return super.getContent() + "[/TEXT]";
    }
}
