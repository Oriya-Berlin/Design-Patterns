package Adapter.implementation_2;

public class VideoMessage implements Message {

    private Video videoMsg;

    @Override
    public void set(String s1, String s2) {
        // some implementation...
    }

    @Override
    public void print() {

        videoMsg.load();
        videoMsg.play();
    }


}
