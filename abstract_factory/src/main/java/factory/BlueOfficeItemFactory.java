package factory;

import office_item.BlueNotebook;
import office_item.BluePen;
import office_item.Notebook;
import office_item.Pen;

public class BlueOfficeItemFactory implements OfficeItemFactory {
    public Pen createPen() {
        return new BluePen();
    }

    public Notebook createNotebook() {
        return new BlueNotebook();
    }
}
