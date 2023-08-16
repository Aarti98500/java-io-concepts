import java.io.*;

//Two abstract classes - reader and writer.
//FileReader extends reader class.
//FileWriter extends writer class.
//FileReader will read characters from specified file.
//FileReader will write characters into specified file.
public class FileReaderWriterExample {
    public static void main(String[] args) throws IOException {

        Reader fileReader = new FileReader("C:\\Users\\Dell\\IdeaProjects\\java-io-concepts\\character-streaming\\src\\input.txt");
        System.out.println(fileReader.ready());

        int size = 100;
        char[] charsFromFile = new char[size];
        fileReader.read(charsFromFile);

        System.out.println(charsFromFile);//print on the console.

        fileReader.close();

        Writer fileWriter = new FileWriter("C:\\Users\\Dell\\IdeaProjects\\java-io-concepts\\character-streaming\\src\\output.txt");
        fileWriter.write(charsFromFile);

        fileWriter.close();

    }

}
