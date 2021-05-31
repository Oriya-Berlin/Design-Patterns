package Decorator;


public class Tag implements ITag{

    private String content;

    public Tag(String content) {
        this.content = content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void showComponent() {

    }

    @Override
    public void setComponent() {

    }

    @Override
    public void printComponent() {
        System.out.println(this.getContent());
    }

}
