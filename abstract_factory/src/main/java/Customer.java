import factory.OfficeItemFactory;
import office_item.Notebook;
import office_item.Pen;

public class Customer {
    private Pen pen;
    private Notebook notebook;

    public Customer(OfficeItemFactory factory) {
        pen = factory.createPen();
        notebook = factory.createNotebook();
    }

    public String getPenInfo() {
        return pen.getPenInfo();
    }
    public String getNotebookInfo() {
        return notebook.getNotebookInfo();
    }
}
