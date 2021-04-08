package PrototypeBasedFactory;

public interface Message{

    void set(String s1, String s2);
    void print();
    Message copy();
    String getType();
}
