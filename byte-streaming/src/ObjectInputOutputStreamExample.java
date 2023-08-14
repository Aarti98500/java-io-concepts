import java.io.*;

/**
 * Working of objectInputStream and objectoutputStream
 * 1. The objectInputStream is mainly used to read data/object written by the objectOutputStream.
 * 2. Basically, the objectOutputStream converts or writes java objects into corresponding streams(Outpur stream).
 *    Those converted streams can be stored in files or transferred through networks.
 *    This is known as 'Sterilization'.
 * 3. Now, if we need to read those objects, we will use the objectStream that will
 *    convert the streams back to corresponding objects. This is known as 'Deserilization'
 */

class Student implements Serializable {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

//Stream is nothing but seq of elements or flow of data or pipe of data.
//FileOutputStream -> writes into a file.
//ObjectOutputStream -> writes to object output stream.

//Input and Output that means Read and Write.
//Input -> read data
//Output -> write data

/*
  The goal of this program is to write the object using objectOutputStream
  and FileOutputStream into a file and then read all the object from the
  file using objectInputSteam and FileInputStream.
 */
public class ObjectInputOutputStreamExample {
    public static void main(String[] args) throws IOException, ClassCastException, InterruptedException {

        Integer number = 100;
        String msg = "Hello Input/Output Stream";
        Student student = new Student("Aarti", 100);

        OutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Dell\\IdeaProjects\\java-io-concepts\\byte-streaming\\src\\object.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(number);
        objectOutputStream.writeObject(msg);
        objectOutputStream.writeObject(student);

        Thread.sleep(3000);

        InputStream fileInputStream = new FileInputStream("C:\\Users\\Dell\\IdeaProjects\\java-io-concepts\\byte-streaming\\src\\object.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        //this objectInputStream will read objects from specified fileInputStream

        Integer integerObjectFromFile = (Integer) objectInputStream.readObject();
        String stringObjectFromFile = (String) objectInputStream.readObject();
        Student studentObjectFromFile = (Student) objectInputStream.readObject();
        System.out.println("integerObjectFromFile : "+integerObjectFromFile);
        System.out.println("stringObjectFromFile : "+stringObjectFromFile);
        System.out.println("studentObjectFromFile : "+studentObjectFromFile);


    }


