package composite.Composites;

import composite.Component;


import java.util.ArrayList;
import java.util.List;


// Composite
public class Container implements Component {

    List<Component> children = new ArrayList<>();

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

    @Override
    public void printComponent(){
        for(Component comp : children)
            comp.printComponent();

    }

    @Override
    public String getComponentContent() {
        return children.toString();
    }


}
