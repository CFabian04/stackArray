import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stack {
    private Integer[] stackArray;
    private int top;

    public Stack(int arraySize) {
        stackArray = new Integer[arraySize];
        top = -1;

    }
    public void push(int value) {
        stackArray[++top] = value;
    }
    public long pop() {
        return stackArray[top--];
    }
    public boolean contains(int number) {
        List<Integer>intList=new ArrayList<>(Arrays.asList(stackArray));
        return(intList.contains(number));
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    private static void createStack(Stack theStack) {
        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);
    }

    public static void main(String[] args) {
        Stack theStack = new Stack(10);

        createStack(theStack);

        System.out.println("Does the Stack contains '10': "+ theStack.contains(10));

        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value+ " ");

        }

    }

}
