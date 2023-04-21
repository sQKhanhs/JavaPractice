package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadCSVFile {
    public void readFileText(String path){
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String[] line;
            int sum = 0;
            while((line = bf.readLine().split(",")) != null){
                System.out.println(line[0] + " " + line[1] + " " + line[2]);
            }
        }
        catch (Exception e){
            System.out.println("File does not exist or corrupted");
        }
    }
    public static void main(String[] args){
        new ReadCSVFile().readFileText("D:\\module02AdvancedJava\\csv.txt");
    }
}
