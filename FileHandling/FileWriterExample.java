import java.io.*;

class FileWriterExample {
    public static void main(String[] args) {
        String filePath = "C:\\Tarun_java\\FileHandling\\firstFile.txt";

        try {
            FileWriter fileWriter = new FileWriter(filePath);

            try {
                fileWriter.write("Java Programming is the best programming language");
            } finally {
                fileWriter.close();
            }

            System.out.println("Successfully wrote data in File.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
