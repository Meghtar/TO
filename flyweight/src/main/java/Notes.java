import java.util.ArrayList;
import java.util.List;

public class Notes {
    private List<Sticknote> sticknotes = new ArrayList<Sticknote>();

    public void addStickNote(int width, int height, String color, String note) {
        SticknoteType type = SticknoteFactory.getSticknoteType(color, width, height);
        Sticknote sticknote = new Sticknote(note, type);
        sticknotes.add(sticknote);
    }

    public String getNotes() {
        String result = "";
        for(Sticknote sticknote : sticknotes) {
            result += sticknote.getNote();
            result += "\n";
        }
        return result;
    }
}