package factory;

import office_item.Notebook;
import office_item.Pen;

public interface OfficeItemFactory {
    Pen createPen();
    Notebook createNotebook();
}
