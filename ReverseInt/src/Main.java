public class Main {
    public static void main(String[] args) {
        int x = reverseInt(456789);
        System.out.println(x);
    }

    public static int reverseInt(int n){
        int newNum = 0;
        int right = 0;

        while(n > 0){
            right = n % 10;
            newNum = newNum * 10 + right;
            n = n / 10;
        }
        return newNum;
    }
}
