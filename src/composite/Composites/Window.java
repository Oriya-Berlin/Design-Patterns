package composite.Composites;

import composite.Component;

import java.util.List;


public class Window extends Container implements Component {

    public void addChildren(Component comp){
        children.add(comp);
    }

    public List<Component> getChildren() {
        return children;
    }

    @Override
    public void setComponent() {

    }

    @Override
    public void showComponent() {

    }
}
