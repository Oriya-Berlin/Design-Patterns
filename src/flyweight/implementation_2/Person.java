package flyweight.implementation_2;

public class Person {

    private Name firstName;
    private String lastName;
    private int age;


    public Person(String firstName, String lastName, int age) {
        this.firstName = NameFactory.createFirstName(firstName);
        this.lastName = lastName;
        this.age = age;
    }


    public String getFirstName() {
        return firstName.getFirstName();
    }

    public void setFirstName(String firstName) {
        this.firstName.setFirstName(firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
