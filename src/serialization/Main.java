package serialization;

import java.io.*;
import java.util.ArrayList;


public class Main {

    // TODO: implement some design patterns in the serialization process

    public static void main(String[] args) {
        serialize();
        deserialize();
    }



    // Read from the file
    static void deserialize(){

        ArrayList<Message> array;

            try {
                FileInputStream fileInputStream = new FileInputStream("./message.ser");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                array = (ArrayList) objectInputStream.readObject();

                for (Message message : array)
                    message.print();

                objectInputStream.close();
                fileInputStream.close();

            }catch (IOException e) {
                e.printStackTrace();

            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }

    }

    // Write into the file
    static void serialize(){

        ArrayList<Object> array= new ArrayList<>();
        Fax fax = new Fax("fax address","fax text fax text");
        Mail mail = new Mail("mail address","mail text mail text");
        array.add(fax);
        array.add(mail);

        try {

            FileOutputStream fileOutputStream = new FileOutputStream("./message.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(array);

            objectOutputStream.close();
            fileOutputStream.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
