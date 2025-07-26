import java.util.Scanner;
public class sqrtofnumber{
    static int sqrt(int n){
        int low=1;
        int high=n;
        int ans=1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(mid<=n/mid){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(sqrt(number));
        sc.close();
        
    }
}