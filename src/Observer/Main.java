package Observer;

public class Main {


    public static void main(String[] args){

        // messages
        Message msg_1 = new Fax("TLV","Hello there!");
        Message msg_2 = new Mail("Jerusalem", "How are you?");

        // messages backup object
        MessagesBackup messagesBackup = MessagesBackup.getInstance();


        // clock
        Clock clock = Clock.getInstance();

        // add observers
        clock.addObserver(msg_1);
        clock.addObserver(msg_2);
        clock.addObserver(messagesBackup);

        // notify
        clock._notifyAll_();



    }


}
