public class Main {
    public static void main(String[] args) {
        System.out.println("Tower of Hanoi");
        h(3, 1 ,3);
    }

    // Print Move function definition
    static void pm(int n, int start, int end) {
        System.out.println("Disk " + n + ": " + start + " -> " + end);
    }

    // Hanoi function definition
    static void h(int n, int start, int end) {
        if (n == 1) {
            pm(n, start, end);
        } else {
            int other = 6 - (start + end);
            h(n - 1, start, other);
            pm(n, start, end);
            h(n - 1, other, end);
        }
    }




}


