public class ConcreteText implements Text{
    private String content;

    ConcreteText(String text) {
        this.content = text;
    }

    public String getContent() {
        return content;
    }
}
