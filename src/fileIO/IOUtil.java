package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class IOUtil {

    public static void tryPrintContents(Path path){

    }

    public static List<String> readFromFile(Path path) throws IOException {

        return Files.readAllLines(path);

    }
    public static void printFileContents(List<String> contents){
        return;Files.readAllLines(path);
    }

    public static void tryWriteToFile(List<String> content, Path path){
        try {
            Files.write(path, content);
        } catch (IOException e){
            System.out.println("Could not write to file at: " + path.toAbsolutePath());
        }

    }
}
