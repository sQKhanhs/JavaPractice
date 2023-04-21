package File;

import java.io.*;
import java.util.ArrayList;

public class CopyFile {
    public void copyFile(String path1, String path2){
        try {
            File sourceFile = new File(path1);
            File targetFile = new File(path2);
            if (!sourceFile.exists() || !targetFile.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFile));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line + "\n");
            }
            bufferedReader.close();
            bufferedWriter.close();
        }
        catch (Exception e){
            System.err.println("File not found or corrupted");
        }
    }
    public static void main(String[] args){
        new CopyFile().copyFile("D:\\module02AdvancedJava\\numbers.txt", "D:\\module02AdvancedJava\\JavaPractice2\\result.txt");
    }
}
