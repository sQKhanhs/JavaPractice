package File;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String path){
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            while((line = bf.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            System.out.println("Sum = " + sum);
        }
        catch (Exception e){
            System.out.println("File does not exist or corrupted");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file path: ");
        String path = input.nextLine();
        new ReadFileExample().readFileText(path);
    }
}
