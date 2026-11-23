
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> numbers = new Stack<>();

        numbers.push(10);
        numbers.push(20);
        numbers.push(30);

        System.out.println("Stack: " + numbers);
        System.out.println("Top element: " + numbers.peek());

        numbers.pop();

        System.out.println("After removing: " + numbers);
    }
}
