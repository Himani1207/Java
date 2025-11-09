import java.util.Scanner;

public class password{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            validatePassword(password); 
            System.out.println("Correct");
        } 
        catch (TooShortException e) {
            System.out.println("Too Short!");
        } 
        catch (NoDigitException e) {
            System.out.println("No digit!");
        }
    }

   
    static void validatePassword(String pass) throws TooShortException, NoDigitException {
        if (pass.length() < 6) {
            throw new TooShortException("Password is too short");
        }

        boolean hasDigit = false; 
        for (char ch : pass.toCharArray()) { 
            if (Character.isDigit(ch)) { 
                hasDigit = true; 
                break; 
            } 
        }

        if (!hasDigit) {
            throw new NoDigitException("No digit in the password");
        }
    }

    
    static class TooShortException extends Exception {
        public TooShortException(String message) {
            super(message);
        }
    }

    static class NoDigitException extends Exception {
        public NoDigitException(String message) {
            super(message);
        }
    }
}
