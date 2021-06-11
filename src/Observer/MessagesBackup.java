package Observer;


public class MessagesBackup implements MidnightObserver {


    private static MessagesBackup instance = null;


    private MessagesBackup(){

    }


    public static MessagesBackup getInstance(){
        if(instance == null)
        {
            synchronized (MessagesBackup.class)
            {
                if(instance == null)
                    instance = new MessagesBackup();
            }
        }
        return instance;
    }


    private void storeMessagesInDb(){
        System.out.println("Messages has been stored in DB!");
    }


    @Override
    public void _notify_() {
        this.storeMessagesInDb();
    }


}
