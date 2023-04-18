package Stack;

public class Main {
    public static void main(String[] args){
        GenericStackClient stackClient = new GenericStackClient();
        stackClient.stackOfStrings();
        stackClient.stackOfIntegers();
        stackClient.stackOfIntegersReverse();
        stackClient.stackOfStringsReverse();
        String str = "Java was developed by James Gosling";
    }
}
