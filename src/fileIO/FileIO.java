package fileIO;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {

    public static void main(String[] args) {
        init();

    }

        public static void init(){
            Path path = FileDirectoryUtil.getPath("src", "fileIO", "files");
            FileDirectoryUtil.tryCreateDirectory(path);

            path = Paths.get(path.toAbsolutePath().toString(),"test.txt");

            System.out.println(path.toAbsolutePath());

            try {
                IOUtil.printFileContents(IOUtil.readFromFile(path));
            } catch (IOException e){
                System.out.println("Unable to read contents of the file at: " + path.toAbsolutePath());
            }


        }


    }



