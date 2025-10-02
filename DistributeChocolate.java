public class DistributeChocolate{
    public static boolean isDivision(int[] arr,int m,int maxchoc){
        int stu=1;
        int choc=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxchoc) return false;
            if(choc+arr[i]<=maxchoc){
                choc+=arr[i];
            }
            else{
                stu++;
                choc=arr[i];
            }
        }
        return stu<=m;
        }
    public static int distribute(int[] arr,int m){
        int st=1;
        int end=(int) 1e9;
        int ans=0;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isDivision(arr,m,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={5,3,1,4,2};

        int m= 3;
        System.out.println(distribute(arr,m));
    }
}