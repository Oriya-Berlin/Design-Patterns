package Adapter.implementation_2;

public class Main {

    public static void main(String[] args){


        Message video_msg_1 = new VideoMessage();
        video_msg_1.set("some address_1", "www.bla-bla.com");
        video_msg_1.print(); // load and play


        Message video_msg_2 = new VideoMessage();
        video_msg_2.set("some address_2", "/home/user/Desktop/video.format");
        video_msg_2.print(); // load and play

    }

}
