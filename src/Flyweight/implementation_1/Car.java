package Flyweight.implementation_1;

public class Car {

    private String company;
    private String model;

    public Car(String company, String model) {
        this.company = company;
        this.model = model;
    }


    public Car(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
