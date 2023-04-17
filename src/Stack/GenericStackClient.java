package Stack;

public class GenericStackClient {
    public void stackOfStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.Size of stack after push operation: " + stack.size());
        System.out.println("2.Commend pop operation");
        while (!stack.isEmpty()){
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n3.Size of stack after pop operation: " + stack.size());
    }
    public void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("1.Size of stack after push operation: " + stack.size());
        System.out.println("2.Commend pop operation");
        while (!stack.isEmpty()){
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n3.Size of stack after pop operation: " + stack.size());
    }
}
