package factory;

import office_item.GreenNotebook;
import office_item.GreenPen;
import office_item.Notebook;
import office_item.Pen;

public class GreenOfficeItemFactory implements OfficeItemFactory {
    public Pen createPen() {
        return new GreenPen();
    }

    public Notebook createNotebook() {
        return new GreenNotebook();
    }
}
