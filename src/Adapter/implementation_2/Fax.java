package Adapter.implementation_2;

public class Fax implements Message {

    private String address;
    private String content;

    public Fax(){

    }

    public Fax(String address, String content) {
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
    public String toString() {
        return "Fax{" +
                "Class='" + this.getClass() + '\'' +
                "address='" + address + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
