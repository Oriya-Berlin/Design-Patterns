package registry;

public class Main {


    public static void main(String[] args){

        // now you can call this instance and get the item from anywhere
        MessagesRegistry instance = MessagesRegistry.getInstance();

        instance.set("msg1",new Mail("mail address","mail text mail text"));
        instance.set("msg2",new Fax("fax address","fax text fax text"));

        for(Message msg: instance.getItems().values())
            msg.print();

    }


}
