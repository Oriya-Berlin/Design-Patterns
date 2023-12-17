package decorator.Decorators;

import decorator.ITag;

public class Bracket extends TagDecorator {


    public Bracket(ITag tag) {
        super(tag);
        this.decorate();
    }

    @Override
    public void decorate() {
        super.tag.setContent("(" + super.tag.getContent() + ")");
    }

    @Override
    public void printComponent() {
        System.out.println(super.tag.getContent());
    }

    @Override
    public String getContent() {
        return super.tag.getContent();
    }

    @Override
    public void setContent(String s) {
        super.tag.setContent(s);
    }

    @Override
    public void showComponent() {

    }

    @Override
    public void setComponent() {
    }

}
