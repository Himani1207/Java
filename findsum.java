import java.util.Scanner;

public class findsum {
    static int altersum(int n){

        if(n==0) return 0;
        if(n%2==0){

            return -n+altersum(n-1);
        }
        else{
            return n+altersum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(altersum(n));
        sc.close();
    }
}
