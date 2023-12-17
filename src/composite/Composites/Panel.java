package composite.Composites;

import composite.Component;

import java.util.List;


public class Panel extends Container implements Component {

    public void addChildren(Component comp){
        super.children.add(comp);
    }

    public List<Component> getChildren() {
        return super.children;
    }

    @Override
    public void setComponent() {

    }

    @Override
    public void showComponent() {

    }
}
