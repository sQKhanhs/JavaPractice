package File;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWriteFileExample {
    public ArrayList<Integer> readFile(String path){
        ArrayList<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bf.readLine()) != null){
                numbers.add(Integer.parseInt(line));
                System.out.println(line);
            }
            bf.close();
        }
        catch (Exception e){
            System.err.println("File not found or corrupted");
        }
        return numbers;
    }
    public int findMax(ArrayList<Integer> numbers){
        int max = numbers.get(0);
        for(int index = 0; index < numbers.size(); index++){
            if(max < numbers.get(index)){
                max = numbers.get(index);
            }
        }
        return max;
    }
    public void writeFile(String path, int max){
        try {
            FileWriter fileWriter = new FileWriter(new File(path));
            BufferedWriter bf = new BufferedWriter(fileWriter);
            bf.write("Max value: " + max);
            bf.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ReadAndWriteFileExample readAndWriteFile = new ReadAndWriteFileExample();
        ArrayList<Integer> numbers = readAndWriteFile.readFile("D:\\module02AdvancedJava\\numbers.txt");
        int maxValue = readAndWriteFile.findMax(numbers);
        readAndWriteFile.writeFile("result.txt", maxValue);
    }
}
