public class Sticknote {
    private String note;
    private SticknoteType type;

    public Sticknote(String note, SticknoteType type) {
        this.note = note;
        this.type = type;
    }

    public String getNote() {
        return type.getSticknote(note);
    }
}
