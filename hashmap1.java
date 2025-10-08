import java.util.*;

// public class hashmap1{
//     public static void main(String[] args){
//         int[] arr={1,2,2,3,1,4};
//         Map<Integer,Integer> mp=new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
//         }
//         System.out.println(mp);
//     }
// }

// public class hashmap1{
//     public static void main(String[] args) {
//         String str="aabbcde";
//         Map<Character,Integer> mp=new HashMap<>(); 
//         for(int i=0;i<str.length();i++){
//             char c=str.charAt(i);
//             mp.put(c,mp.getOrDefault(c, 0)+1);
//         }
        
//         for(int i=0;i<str.length();i++){
//             char c=str.charAt(i);
//             if(mp.get(c)==1){
//                System.out.println(c);
               
//             }
//         }
//     }
// }


public class hashmap1{
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;

        Map<Integer,Integer> mp=new HashMap<>();
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(target-arr[i])){
                found=true;
                System.out.println(target-arr[i]+","+arr[i]);
                break;
            }
            mp.put(arr[i],1);
        }

    }
}

