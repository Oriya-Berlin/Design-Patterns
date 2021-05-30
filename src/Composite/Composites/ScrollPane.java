package Composite.Composites;

import Composite.Component;

import java.util.List;


public class ScrollPane extends Container implements Component {

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
