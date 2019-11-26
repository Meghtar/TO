public class PrototypePage extends PrototypePaper {

    private int amountOfPictures;

    public PrototypePage(String text, String author, int pictures) {
        this.textOnPage = text;
        this.author = author;
        this.amountOfPictures = pictures;
    }

    public PrototypePage(PrototypePage prototypePage) {
        super(prototypePage);
        if(prototypePage != null) {
            this.amountOfPictures = prototypePage.getAmountOfPictures();
        }
    }

    @Override
    public PrototypePaper clone() {
        return new PrototypePage(this);
    }

    public int getAmountOfPictures() {
        return amountOfPictures;
    }
}
