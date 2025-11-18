import java.util.Scanner;
public class findsmallestletter{
    static char find(char[] arr,char target){
        int st=0;
        int end=arr.length-1;
        char ans=arr[0];
        while(st<=end){
            int mid=st+(end-st)/2;
           
             if(target<arr[mid]){
                ans=arr[mid];
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] arr=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);
        }
        char target=sc.next().charAt(0);
        System.out.println(find(arr,target));
    }
}