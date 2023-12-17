package factory;


public class Main{


    public static void main(String[] args){

        Message msg1 = MessageFactory.createMessage(MsgEnum.FAX);
        msg1.set("TLV", "Hello there TLV!");
        msg1.print();

        Message msg2 = MessageFactory.createMessage(MsgEnum.MAIL);
        msg2.set("LA", "Hello there LA!");
        msg2.print();
    }

}
