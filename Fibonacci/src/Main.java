import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fibonacci");
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        printFibonacci(index);
    }

    static int fibonacci(int n) {
        if (n == 0 || n ==1){
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

    static void printFibonacci(int index) {
        for(int i = 0; i < index; i++){
            System.out.println((fibonacci(i)));
        }
    }
}