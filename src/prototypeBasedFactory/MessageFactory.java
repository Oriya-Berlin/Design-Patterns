package prototypeBasedFactory;

import java.util.HashMap;

// should be SINGLETON
public class MessageFactory {

    private static MessageFactory instance = null;
    private static HashMap<String, Message> prototypes;

    private MessageFactory(){
        prototypes = new HashMap<>();
    }

    public static MessageFactory getInstance(){

        if(instance == null)
        {
            synchronized (MessageFactory.class)
            {
                if(instance == null)
                    instance = new MessageFactory();
            }
        }
        return instance;
    }

    public void addPrototype(Message msgObj){
        prototypes.put(msgObj.getType(), msgObj.copy());
    }

    public Message createObject(String type){
        return prototypes.get(type).copy();
    }


}
