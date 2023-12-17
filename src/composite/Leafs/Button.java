package composite.Leafs;

import composite.Component;

// Leaf
public class Button implements Component {

    private String content;

    public Button(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void setComponent() {

    }

    @Override
    public void showComponent() {

    }

    @Override
    public void printComponent(){
        System.out.println(content);
    }

    @Override
    public String getComponentContent() {
        return this.content;
    }
}
