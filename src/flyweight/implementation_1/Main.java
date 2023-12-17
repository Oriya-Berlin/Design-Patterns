package flyweight.implementation_1;



public class Main {

    public static void main(String[] args) {

        Car c1 = CarFactory.createCar("6");
        c1.setCompany("Mazda");

        Car c2 = CarFactory.createCar("3");
        c2.setCompany("Mazda");

        Car c3 = CarFactory.createCar("6");
        c3.setCompany("Mazda");

        Car c4 = CarFactory.createCar("civic");
        c4.setCompany("Honda");

        Car c5 = CarFactory.createCar("5");
        c5.setCompany("Mazda");

        Car c6 = CarFactory.createCar("civic");
        c6.setCompany("Honda");


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);

        System.out.println("--------------------");

        for(Car c : CarFactory.cars.values())
            System.out.println(c);

    }
}
