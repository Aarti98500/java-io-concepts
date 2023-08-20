import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderOutputStreamWriterExample {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Dell\\IdeaProjects\\java-io-concepts\\character-streaming\\src\\input.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);) {
            char[] charsFromInputFile = new char[100];
            inputStreamReader.read(charsFromInputFile);

            System.out.println(charsFromInputFile);
            try(FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Dell\\IdeaProjects\\java-io-concepts\\character-streaming\\src\\output.txt");
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
                ) {
                outputStreamWriter.write(charsFromInputFile);

            }catch (IOException ioException){
                System.out.println(ioException.getMessage());
            }

        }catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }
    }
}
