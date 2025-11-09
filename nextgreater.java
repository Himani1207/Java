import java.util.Stack;

public class nextgreater{
    public static void main(String[] args) {
        int[] arr={1,2,2,1,8,6,3,4};
        int[] res=new int[arr.length];
        // for(int i=0;i<arr.length;i++){
        //     int ele=arr[i];
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]>ele){
        //             res[i]=arr[j];
        //             break;
        //         }
        //     }
        // }
        int n=arr.length;
        res[n-1]=-1;
        Stack<Integer> st=new Stack<>();
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=-1;
            }else{
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ") ;
        }

    }
}