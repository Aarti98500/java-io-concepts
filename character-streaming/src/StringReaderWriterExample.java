import java.io.*;
/*
   StringReader extends reader.
   StringWriter extends writer.
   StringReader will read from a string object.
   StringWriter will write to string object.
 */

public class StringReaderWriterExample {
    public static void main(String[] args) throws IOException {
        String stringMessage = "Hello from String";
        try(Reader stringReader = new StringReader(stringMessage)) {
            char[] charsFromString = new char[20];

            stringReader.read(charsFromString);

            System.out.println(charsFromString);

            try(Writer stringWriter = new StringWriter()) {
                String writtenString = "";

                stringWriter.write(writtenString);

                System.out.println("Written String "+ writtenString);

            }catch (IOException ioException){
                System.out.println(ioException.getMessage());
            }
        }catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }

    }
}
