package serialization;

import java.io.Serializable;

public class Mail implements Message, Cloneable, Serializable {

    private String address;
    private String content;

    public Mail(){
    }

    public Mail(String address, String content) {
        this.address = address;
        this.content = content;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void set(String s1, String s2) {
        this.address = s1;
        this.content = s2;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public Message copy(){
        return new Mail();
    }

    @Override
    public String toString() {
        return "Mail{" +
                "Class='" + this.getClass() + '\'' +
                "address='" + address + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
