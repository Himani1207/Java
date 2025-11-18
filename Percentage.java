import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter marks for 5 subjects:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        
        int total = a + b + c + d + e;
        int maxMarks = 500; 
        double percentage = (double) total / maxMarks * 100;
        

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}
