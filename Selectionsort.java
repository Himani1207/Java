import java.util.Scanner;
public class Selectionsort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n-1;i++){
            int mini=i;
            for(int j=i+1;j<n;j++){
                if(arr[mini]>arr[j]){
                    mini=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mini];
            arr[mini]=temp;
            count++;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println(count);
        sc.close();

    }
}