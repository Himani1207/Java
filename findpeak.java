public class findpeak{
    static int peak(int[] arr,int size){
        int st=0;
        int end=size-1;
        while(st<end){
            int mid=st+(end-st)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                st=mid+1;
            }
        }
        return st;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,3,1};
        int n=arr.length;
        System.out.println(peak(arr,n));

    }
}