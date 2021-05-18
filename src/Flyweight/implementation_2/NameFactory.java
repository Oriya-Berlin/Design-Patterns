package Flyweight.implementation_2;

import java.util.HashMap;

public class NameFactory {

    public static HashMap<String, Name> firstNames = new HashMap<String, Name>();

    public static Name createFirstName(String firstName){

        Name newFirstName = null;

        if(firstNames.containsKey(firstName))
            newFirstName = firstNames.get(firstName);
        else {
            newFirstName = new Name(firstName);
            firstNames.put(firstName, newFirstName);
        }

        return newFirstName;
    }
}
