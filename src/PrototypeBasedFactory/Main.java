package PrototypeBasedFactory;


public class Main {


    // PROTOTYPE based FACTORY  -  implementation
    public static void main(String[] args){

        // create some objects
        Message mailMsg = new Mail();
        Message faxMsg = new Fax();
        mailMsg.set("Tel-Aviv", "this is text ((1))");
        faxMsg.set("Jerusalem", "this is text ((2))");

        // create our prototype factory instance
        MessageFactory messageFactory = MessageFactory.getInstance();

        // add some prototypes to our list
        messageFactory.addPrototype(mailMsg);
        messageFactory.addPrototype(faxMsg);

        // now we are creating the NEW objects with the same types
        Message newMsg = messageFactory.createObject(mailMsg.getType());

        // test
        newMsg.print(); // (should be null)
        newMsg.set("bla bla", "just a simple text");
        newMsg.print();
    }

}
