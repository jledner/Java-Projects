import java.util.Stack;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        // Postfix expression
        String exp = "5 3 + 4 / 10 * ";
        String current =" ";
        Stack<Integer> myStack = new Stack<>();
        int numBegin = 0;

        // Loop through elements in expression
        for(int i = 0; i < exp.length(); i++){

            // Extract current element
            current = exp.substring(i, i+1);

            // If current element is a space, then detect previous operators/operators
            if(current.equals(" ")){
                // Extract previous operator/operand
                String sub = exp.substring(numBegin, i);

                // Detect operators, pop last two items from stack, perform operation, and push back onto stack
                switch (sub) {
                    case "+" -> myStack.push(myStack.pop() + myStack.pop());
                    case "*" -> myStack.push(myStack.pop() * myStack.pop());
                    case "-" -> {
                        int second = myStack.pop();
                        int first = myStack.pop();
                        myStack.push(first - second);
                    }
                    case "/" -> {
                        int second = myStack.pop();
                        int first = myStack.pop();
                        myStack.push(first / second);
                    }

                    // assume operand if not an operator, and push onto stack
                    default -> myStack.push(parseInt(sub));
                }
            }
        }
        System.out.println(myStack);
    }
}