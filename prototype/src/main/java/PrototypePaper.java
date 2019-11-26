public abstract class PrototypePaper implements Cloneable{
    
    protected String textOnPage;
    protected String author;

    public PrototypePaper(PrototypePaper paper) {
        if(paper != null) {
            this.textOnPage = paper.getText();
            this.author = paper.getAuthor();
        }
    }

    protected PrototypePaper() {
    }

    public abstract PrototypePaper clone();

    public String getText() {
        return this.textOnPage;
    }

    public String getAuthor() {
        return this.author;
    }
    
}
