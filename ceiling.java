import java.util.Scanner;

public class ceiling{
    static int Find(int[] arr,int target){
        int st=0;
        int end=arr.length-1;
        if (st >= arr.length) return -1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(target>arr[mid]){
                st=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[st];
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        System.out.println(Find(arr,target));
        sc.close();
    }
}