package Stack;

import java.util.LinkedList;

public class GenericStackClient {
    public void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.Size of stack after push operation: " + stack.size());
        System.out.println("2.Commend pop operation");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n3.Size of stack after pop operation: " + stack.size());
    }

    public void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("1.Size of stack after push operation: " + stack.size());
        System.out.println("2.Commend pop operation");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n3.Size of stack after pop operation: " + stack.size());
    }

    public void stackOfIntegersReverse() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        MyGenericStack<Integer> stack2 = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack.getStack());
        int originalSize = stack.size();
        for (int index = 0; index < originalSize; index++) {
            stack2.push(stack.pop());
        }
        stack.getStack().addAll(stack2.getStack());
        System.out.println(stack.getStack());
    }

    public void stackOfStringsReverse() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        MyGenericStack<String> stack2 = new MyGenericStack<>();
        String test = "ABC DEF";
        String[] part = test.split("(?!^)");
        for (String word : part)
            stack.push(word);
        System.out.println(stack.getStack());
        int originalSize = stack.size();
        for (int index = 0; index < originalSize; index++) {
            stack2.push(stack.pop());
        }
        stack.getStack().addAll(stack2.getStack());
        System.out.println(stack.getStack());
    }
}
