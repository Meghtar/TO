public class PrototypeDocument extends PrototypePaper {

    private String topic;

    public PrototypeDocument(String text, String author, String topic) {
        this.textOnPage = text;
        this.author = author;
        this.topic = topic;
    }

    public PrototypeDocument(PrototypeDocument prototypeDocument) {
        super(prototypeDocument);
        if(prototypeDocument != null) {
            this.topic = prototypeDocument.getTopic();
        }
    }

    @Override
    public PrototypePaper clone() {
        return new PrototypeDocument(this);
    }

    public String getTopic() {
        return topic;
    }
}
