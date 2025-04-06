public class Main {
    public static void main(String[] args) throws AgeLessThanZeroException {
        System.out.println("Hello, World!");
        int x = 5;
        try{
            x = x / 0;
        }
        catch(ArithmeticException e){
            System.out.println("You can't divide by zero!");
            System.out.println(e);
        }

        validateAge(-3);
    }

    private static void validateAge (int age) throws AgeLessThanZeroException{
        if (age < 0){
            throw new AgeLessThanZeroException("Age cannot be negative");
        }
    }
}