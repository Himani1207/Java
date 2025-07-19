
import java.util.Scanner;

public class leftrotatebyk{
    static void reverse(int[] arr,int n,int k){
        k--;
       while(n<k){
        int temp=arr[n];
        arr[n]=arr[k];
        arr[k]=temp;
        n++;
        k--;
       }
      
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int s=arr.length;
        k=k%s;
        reverse( arr,0,k);
        reverse(arr, k,s);
        reverse(arr, 0, s);
        
        for(int i=0;i<s;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}