package flyweight.implementation_1;

import java.util.HashMap;

public class CarFactory {

    public static HashMap<String, Car> cars = new HashMap<String, Car>();

    public static Car createCar(String model){

        Car newCar = null;

        if(cars.containsKey(model))
            newCar = cars.get(model);
        else
        {
            newCar = new Car(model);
            cars.put(model, newCar);
        }

        return newCar;
    }

}
