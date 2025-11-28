import java.util.ArrayList;
import java.util.Scanner;

// public class recurssionn{
//     static int gcd(int x,int y){
//         if(y==0) return x;
         
//         return gcd(y,x%y);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt();
//         int y=sc.nextInt();

//         System.out.println((x*y)/gcd(x,y));

//         sc.close();
//     }
// }


//ARRAYS 
// public class recurssionn{
//     static void reverse(int[] arr,int index){
//         if(index==arr.length){
//             return;
//         }

//         reverse(arr, index+1);
//         System.out.print(arr[index]+" ");
 


        
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         reverse(arr,0);
//     }
//}

// public class recurssionn{
//     static int maxin(int[] arr,int index){
//         if(index==arr.length-1){
//             return arr[index];
//         }
//         int small=maxin(arr,index+1);

//         return Math.min(arr[index],small);
// }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int[] arr={1,3,4,4,2};

//         System.out.println(maxin(arr,0));
//     }
// }

// public class recurssionn{
//     static int summ(int[] arr,int index){
//         if(index==arr.length){
//             return 0;
//         }
//         return arr[index]+summ(arr,index+1);
//     }
//     public static void main(String[] args){
//         int[] arr={1,2,3,4,5};
//         System.out.println(summ(arr,0));
//     }
// }


// public class recurssionn{
//     static int search(int[] arr,int target,int n,int index){
//         if(index>=n){
//             return -1;
//         }

//         if(arr[index]==target) return index;
        
//         return search(arr,target,n,index+1);

        

//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();
//         int[] arr={11,1,2,14,3,2};

//         int x=search(arr,n,arr.length,0);
//         System.out.println(x);


//     }
// }

// public class recurssionn{
//     static void indices(int[] arr,int n,int target,int index){
//         if(index>=n) return ;

//         if(arr[index] == target){
//             System.out.println(index);
//         }

//         indices(arr, n, target, index+1);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr={1,2,2,2,3,4,2,3};
//         indices(arr,arr.length,n,0);
//     }
// }


// public class recurssionn{
//     static ArrayList<Integer> indices(int[] arr,int n,int tagret,int index){
//         if(index>=n){
//             return new ArrayList<>();
//         }

//         ArrayList<Integer> ans=new ArrayList<>();
//         if(arr[index]==tagret){
//             ans.add(index);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int target=sc.nextInt();
//         int[] arr={1,2,2,2,2,2,3,4,5,1};

//         ArrayList<Integer> ans=indices(arr,arr.length,target,0);


//     }
// }

// public class recurssionn{
//     static String remove(String s){
//         if(s.length()==0) return " ";
//         String smallAns=remove(s.substring(1));
//         char curr=s.charAt(0);
//         if(curr!='a'){
//             return curr+smallAns;
//         }
//         return smallAns;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         System.out.println(remove(s));
//     }
// }

// public class recurssionn{
//     static String reverse(String s,int index){
//         if(index==s.length()) return "";
//         String smallAns=reverse(s, index+1);
//         return smallAns+s.charAt(index);

//         }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         System.out.println(reverse(s,0));
//     }
// }


public class recurssionn{
    static boolean ispallindrome(String s,int n,int m){
        if(s.length()==n) return true;

        if(s.charAt(n)!=s.charAt(m)) return false;
        return ispallindrome(s, n+1, m-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        System.out.println(ispallindrome(s,0,s.length()-1));

    }
}