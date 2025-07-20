import java.util.*;
public class maxconsecutiveone{
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1,0,1,1};
        int count=0;
        int most=0;
        for(int i=1;i<arr.length;i++){
            
            if(arr[i]==1){
                count++;
                most=Math.max(most,count);
            }
            else{
                count=0;
            }
        }
        System.out.println(most);
    }
}