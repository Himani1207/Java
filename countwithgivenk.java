import java.util.Scanner;
public class countwithgivenk
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         int k=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int xor=0;

            for(int j=i;j<n;j++){
            xor=xor^arr[j];
            if(xor==k){
                count++;
            } 
            }
        }
        System.out.println(count);
        sc.close();
    }
}