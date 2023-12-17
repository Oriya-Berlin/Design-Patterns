package observer;

import java.util.Date;

public class Document implements Observable {
    private String name;
    private Object data;
    private Date lastBackupDate;

    public Document(String name, Object data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Date getLastBackupDate() {
        return lastBackupDate;
    }

    @Override
    public void update() {
        this.lastBackupDate = new Date();
    }
}
