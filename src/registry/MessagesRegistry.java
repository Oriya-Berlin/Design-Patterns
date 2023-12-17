package registry;

import java.util.HashMap;

public class MessagesRegistry {

    private static MessagesRegistry instance = null;
    private HashMap<String,Message> items;


    private MessagesRegistry(){
        items = new HashMap<>();
    }


    public static MessagesRegistry getInstance(){

        if(instance == null)
        {
            synchronized (MessagesRegistry.class)
            {
                if(instance == null)
                    instance = new MessagesRegistry();
            }
        }
        return instance;
    }


    public Message get(String key){
        return items.get(key);
    }


    public void set(String key, Message value){
        items.put(key, value);
    }


    public HashMap<String,Message> getItems(){
        return items;
    }

}
