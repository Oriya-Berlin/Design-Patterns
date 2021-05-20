package Adapter.implementation_2;

public class VideoMessage implements Message {

    private String address;
    private Video content; // video MSG

    @Override
    public void set(String s1, String s2) {
        this.address = s1;
        this.content = new Video(s2);
    }

    @Override
    public void print() {
        content.load();
        content.play();
    }


}
