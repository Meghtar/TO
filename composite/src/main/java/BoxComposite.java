import java.util.ArrayList;
import java.util.List;

public class BoxComposite implements Component{
    private List<Component> BoxContent;
    private float price;
    private String name;

    public float getPrice(){
        float sum = this.price;
        for(Component component : BoxContent) {
            sum += component.getPrice();
        }
        return sum;
    }

    public String getName() {
        return this.name;
    }

    public void add(Component component) {
        BoxContent.add(component);
    }

    public void remove(Component component) {
        BoxContent.remove(component);
    }

    public List<Component> getBoxContent() {
        return this.BoxContent;
    }

    public BoxComposite(float price, String name) {
        this.price = price;
        this.name = name;
        this.BoxContent = new ArrayList<Component>();
    }
}
