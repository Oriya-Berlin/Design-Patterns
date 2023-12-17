package observer;

import java.util.ArrayList;
import java.util.List;

public class DocumentBackupHandler {
    private static DocumentBackupHandler instance = null;
    private List<Observable> observers;


    private DocumentBackupHandler(){
        observers = new ArrayList<>();
    }


    public static DocumentBackupHandler getInstance(){
        synchronized (DocumentBackupHandler.class) {
            if(instance == null)
                instance = new DocumentBackupHandler();
        }
        return instance;
    }


    public void add(Observable observer){
        observers.add(observer);
    }


    public void remove(Observable observer){
        observers.remove(observer);
    }


    public void backupFiles(){
        // some backup logic
        alertAll();
    }


    public void alertAll(){
        observers.parallelStream().forEach(Observable::update);
    }

}
