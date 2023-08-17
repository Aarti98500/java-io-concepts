import java.io.*;

//Two abstract Classes - Reader and Writer.
//FileReader extends Reader class.
//FileWriter extends Writer class.
//FileReader will read characters from specified file.
//FileWriter will write characters into the specified file.

public class FileReaderWriterExampleWithResources {
    public static void main(String[] args) throws IOException {

        try(Reader fileReader = new FileReader("C:\\Users\\Dell\\IdeaProjects\\java-io-concepts\\character-streaming\\src\\input.txt")) {
            System.out.println(fileReader.ready());

            int size = 100;
            char[] charsFromFile = new char[size];//all arrays have fixed length.

            fileReader.read(charsFromFile);

            System.out.println(charsFromFile);//print on the console.

            try(Writer fileWriter = new FileWriter("C:\\Users\\Dell\\IdeaProjects\\java-io-concepts\\character-streaming\\src\\output.txt")) {

                fileWriter.write(charsFromFile);

            }catch (IOException ioException){
                System.out.println(ioException.getMessage());
            }
            }catch (IOException ioException){
                System.out.println(ioException.getMessage());

        }

    }
}
