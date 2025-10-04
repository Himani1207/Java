//import java.util.Scanner;

public class Frogjump{
    public static int jump(int[] arr,int index,int size){
          if(index==size-1) return 0;
           int m=Math.abs(arr[index+1]-arr[index])+jump(arr,index+1,size);
            if(index==size-2) return m;
           int n=Math.abs(arr[index+2]-arr[index])+jump(arr,index+2,size);
            return  Math.min(m,n);
    }
    public static void main(String[] args) {         
        int[] arr={10,30,40,20};
        int x=jump(arr,0,arr.length);
        System.out.println(x);
    }
}