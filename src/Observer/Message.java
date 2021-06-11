package Observer;

public interface Message extends MidnightObserver {

    void set(String s1, String s2);
    void print();
    void send();
}
