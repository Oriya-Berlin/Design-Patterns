package prototype;


public class Main{


    public static void test1(Message msg){

        // new instance of the same class as 'msg' parameter
        Message newMsg = msg.copy();

        newMsg.set("Tel-Aviv", "this1 is1 text1");
        newMsg.print();
    }

    public static void test2(Message msg){

        // new instance of the same class as 'msg' parameter
        Message newMsg = msg.copy();

        newMsg.set("Jerusalem", "this2 is2 text2");
        newMsg.print();
    }



    // PROTOTYPE  -  implementation
    public static void main(String[] args){

        Message msg1 = new Mail();
        test1(msg1);

        Message msg2 = new Fax();
        test2(msg2);

    }

}
