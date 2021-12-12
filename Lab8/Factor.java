package Lab8;

public class Factor {
    public static void main(String[] args) {
        StackOfInteger stack = new StackOfInteger();
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter the integer: ");
        int num = input.nextInt();

        System.out.println(num);

        int Factor = 2;
        while (Factor <= num) {
            if (num % Factor == 0) {
                num = num / Factor;
                stack.push(Factor);
            } else {
                Factor++;
            }
        } // Push i to the stack

        while (!stack.empty()) // Test if stack is empty
            System.out.print(stack.pop() + " "); // Remove and return from stack
    }

}
