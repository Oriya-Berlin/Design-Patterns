package Observer;

import java.util.ArrayList;
import java.util.List;


public class Clock {

    private static Clock instance = null;
    private List<MidnightObserver> observersList;


    private Clock(){
        observersList = new ArrayList<>();
    }


    public static Clock getInstance(){

        if (instance == null)
        {
            synchronized (Clock.class)
            {
                if(instance == null)
                    instance = new Clock();
            }
        }
        return instance;
    }


    public void getTime(){
        // we can implement here some 'time' bullshit...
    }


    public void addObserver(MidnightObserver observer){
        observersList.add(observer);
    }


    public void removeObserver(MidnightObserver observer){
        observersList.remove(observer);
    }


    public void _notifyAll_(){
        for (MidnightObserver mid_obs : observersList)
            mid_obs._notify_();
    }

}
