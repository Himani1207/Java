public class Findoccurence{

    public static int occur(int[] arr,int target){
        int st=0;
        int end=arr.length-1;
        int first=0;
        int last=0;
        while(st<=end){
            if(arr[st]==target){
                first=st;
                break;
            }
            st++;
        }
         while(end>=0){
            if(arr[end]==target){
                last=end;
                break;
            }
            end--;
        }
        return last-first+1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,4,5};
        int target=2;
        System.out.println(occur(arr,target));
        }
}