import java.util.Scanner;
public class buyandsellstock{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] price=new int[n];

        for(int i=0;i<n;i++){
            price[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<n;i++){
            if(price[i]<min){
                min=price[i];
            }
            else{
                int profit=price[i]-min;
                if(profit>max){
                    max=profit;
                }
            }
        }
        System.out.println(max);
    }
}