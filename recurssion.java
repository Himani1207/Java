//import java.util.Scanner;

// public class recurssion{
//     static void  multiples(int n,int k){
//         if(k==0){
//             //System.out.println(n);
//             return ;
//         }
//         multiples(n,k-1);
//         System.out.println(n*k);
       
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         multiples(a,b);
//         sc.close();
//     }
// }

// public class recurssion{
//     static int natural(int n){
//         int sum=0;
//         if(n<=0){
//             return sum;
//         }
//         if(n%2!=0){
//             sum=natural(n-1)+n;
//         }
//         else{
//             sum=natural(n-1)-n;
//         }
//         return sum;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println(natural(n));
//     }
// }