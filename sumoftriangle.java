import java.util.Scanner;
public class sumoftriangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[][] triangle=new int[n][];
        triangle[0]=arr;
        for(int i=1;i<n;i++){
            int[] previous=triangle[i-1];
            int[] current=new int[previous.length-1];
            for(int j=0;j<current.length;j++){
                current[j]=previous[j]+previous[j+1];
            }
            triangle[i]=current;
        }
        for(int i=n-1;i>=0;i--){
            for(int num:triangle[i]){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}