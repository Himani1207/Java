public class UpperBound{

    public static int upper(int[] arr,int x){
        int st=0;
        int end=arr.length-1;
        int ans=0;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]>x){
                ans=arr[mid];
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3};
        int x=2;


        System.out.println(upper(arr,x));
    }
}