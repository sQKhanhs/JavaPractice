import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountChar2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        String word = input.nextLine().toLowerCase();

        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        char[] charList = word.toCharArray();
        for(char letter: charList)
            if(!treeMap.containsKey(letter)) {
                treeMap.put(letter, 1);
            } else{
                int letterCount = treeMap.get(letter);
                treeMap.replace(letter, letterCount + 1);
            }
        for(Map.Entry<Character, Integer> entry: treeMap.entrySet())
            System.out.println("The word " + entry.getKey() + " appears " + entry.getValue() + " times ");
    }
}
