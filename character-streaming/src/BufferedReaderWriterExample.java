import java.io.*;
import java.util.Arrays;

public class BufferedReaderWriterExample {
    public static void main(String[] args) throws IOException {

        try(FileReader fileReader = new FileReader("C:\\Users\\Dell\\IdeaProjects\\java-io-concepts\\character-streaming\\src\\input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            ){
            char[] charsFromInputFile = new char[100];
            bufferedReader.read(charsFromInputFile);
            System.out.println("Input string read by buffer reader from input.txt" + Arrays.toString(charsFromInputFile));
            try(FileWriter fileWriter = new FileWriter("C:\\Users\\Dell\\IdeaProjects\\java-io-concepts\\character-streaming\\src\\output.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                ) {
                bufferedWriter.write(charsFromInputFile);
                System.out.println("buffer writer done with writing.");


            }catch (IOException ioException){
                System.out.println(ioException.getMessage());
            }
        }catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }

    }
}
