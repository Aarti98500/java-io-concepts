import java.io.*;

//resource means objects.
//try with resource means create objects inside () of try and close them automatically after their use.
public class BufferedInputOutputStreamExample {
    public static void main(String[] args) throws IOException {
        //Read from input file.
        //below is try with resources example.
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Dell\\IdeaProjects\\java-io-concepts\\byte-streaming\\src\\input.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream) {

//            byte[] bytes = bufferedInputStream.readAllBytes();
//            System.out.println(new String(bytes));

            //write to output file
            try (FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Dell\\IdeaProjects\\java-io-concepts\\byte-streaming\\src\\output.txt");
                 BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);{

                  bufferedOutputStream.write(bufferedInputStream.readAllBytes());
            }

        }
        ) }
}





