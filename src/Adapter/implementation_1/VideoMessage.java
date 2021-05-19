package Adapter.implementation_1;

public class VideoMessage extends Video implements Message{


    @Override
    public void set(String s1, String s2) {
        // some implementation...
    }

    @Override
    public void print() {

        super.load();
        super.play();
    }


}
