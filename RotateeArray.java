import java.util.ArrayList;
public class RotateeArray{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        int n=arr.length;
        //int index=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0,j=n-k;i<k;i++,j++){
            list.add(arr[j]);
        }

        for(int i=(n-k)-1,j=0;i<n;i++,j++){
            list.add(arr[j]);
        }
       // for(int )
       System.out.println(list);
    }
}