package decorator.Decorators;


import decorator.ITag;

public abstract class TagDecorator implements ITag {

    protected ITag tag;

    public TagDecorator(ITag tag) {
        this.tag = tag;
    }

    public void decorate(){

    }


}
