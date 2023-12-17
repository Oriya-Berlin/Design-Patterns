package flyweight.implementation_2;

public class Main {

    public static void main(String[] args) {


        Person p1 = new Person("Haim", "Cohen", 20);
        Person p2 = new Person("Haim", "Levi", 25);
        Person p3 = new Person("Haim", "Aizen", 30);
        Person p4 = new Person("Yair", "Alon", 35);
        Person p5 = new Person("Kobi", "Keren", 40);


        // We can see now the memory addresses
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        System.out.println("----------------------------");

        for (Name n : NameFactory.firstNames.values())
            System.out.println(n.toString());


    }
}