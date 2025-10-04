import java.util.Scanner;
public class Nthrootofnumber{
    static int power(int mid,int n,int m){
        int result=1;
        for(int i=0;i<n;i++){
            result*=mid;
            if (result > m) return result; 
        }
        return result;
    }
    static int binarysearch(int n,int m){
        int low=1;
        int high=m;
       
        while(low<=high){
            int mid=low+(high-low)/2;
            int multi=power(mid,n,m);
            if(multi==m){
                return mid;
            }
            else if(multi<m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(binarysearch(n,m));
        sc.close();
        
    }
}