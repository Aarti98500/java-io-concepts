import java.io.*;
/**
 * Working of ObjectInputStream and ObjectOutputStream
 * 1. The ObjectInputStream is mainly used to read data/object written by the ObjectOutputStream.
 * 2. Basically, the ObjectOutputStream converts or writes Java objects into corresponding streams(Output stream).
 *    Those converted streams can be stored in files or transferred through networks.
 *    This is known as `Serialization`.
 * 3. Now, if we need to read those objects, we will use the ObjectInputStream that will
 *    convert the streams back to corresponding objects. This is known as `Deserialization`.
 */



//Stream is nothing but seq of elements or flow of data or pipe of data
//FileOutputStream -> writes into a file.
//ObjectOutputStream -> writes to Object Output stream.

//Input and Output that means Read and Write
//Input -> read data
//Output -> write data

/*
The goal of this program is to write the object using ObjectOutputStream
and FileOutputStream into a file and then read all the object from the
file using ObjectInputStream and FileInputStream
 */

public class ObjectInputOutputStreamExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        Integer number = 100;
        String msg = "Hello Input/Output Stream";
        Student student = new Student("Aarti", 100);

        OutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Dell\\IdeaProjects\\java-io-concepts\\byte-streaming\\src\\Object.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(number);
        objectOutputStream.writeObject(msg);
        objectOutputStream.writeObject(student);

        Thread.sleep(3000);

        InputStream fileInputStream = new FileInputStream("C:\\Users\\Dell\\IdeaProjects\\java-io-concepts\\byte-streaming\\src\\Object.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        //this ObjectInputStream will read objects from specified fileInputStream.

        Integer integerObjectFromFile = (Integer) objectInputStream.readObject();
        String stringObjectFromFile = (String) objectInputStream.readObject();
        Student studentObjectFromFile = (Student) objectInputStream.readObject();

        System.out.println("integerObjectFromFile : "+ integerObjectFromFile);
        System.out.println("stringObjectFromFile : "+ stringObjectFromFile);
        System.out.println("studentObjectFromFile : "+ studentObjectFromFile);

    }
}
