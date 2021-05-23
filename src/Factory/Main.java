package Factory;


public class Main{


    public static void main(String[] args){

        Message msg1 = MessageFactory.createMessage(MSG.FAX);
        msg1.set("TLV", "Hello there TLV!");
        msg1.print();

        Message msg2 = MessageFactory.createMessage(MSG.MAIL);
        msg2.set("LA", "Hello there LA!");
        msg2.print();
    }

}
