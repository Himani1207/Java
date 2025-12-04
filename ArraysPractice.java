// LARGEST ELEMENT IN ARRAY

// public class ArraysPractice{
//     public static void main(String[] args) {
//         int[] arr={2,34,12,5,3};
//         int n=arr.length;
//         int min=arr[0];
//         for(int i=1;i<n;i++){
//             if(arr[i]>min){
//                 min=arr[i];
//             }
//         }
//         System.out.println(min);
//     }
// }

// SUM OF ALL ELEMENTS
// public class ArraysPractice{
//     public static void main(String[] args) {
//         int[] arr={2,34,12,5,3};
//         int sum=0;
//         for(int i=0;i<arr.length;i++){
//             sum+=arr[i];
//         }
//         System.out.println(sum);
//     }
// }


// SEARCH AN ELEMENT IN AN ARRAY
// import java.util.Scanner;
// public class ArraysPractice{
//     public static void main(String[] args) {
//         int[] arr={2,34,5,3,12};
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int ele=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==n){
//                 ele=arr[i];
//             }
//         }
//         System.out.println(ele);
//         sc.close();
//     }
// }

// REMOVE DUPLICATE
// import java.util.ArrayList;
// public class ArraysPractice{
//     public static void main(String[] args) {
//         int[] arr={1,34,12,10,35,1};
//         ArrayList<Integer> b = new ArrayList<>();

//         for(int i=0,j=0;i<arr.length;i++,j++){
//             if(arr[i]!=arr[i+1] && i<arr.length-1){
//                 b.add(arr[i]);
//             }
//         }
//         for(int j=0;j<b.size();j++){
//             System.out.println(b.get(j));
//         }
//     }
// }


// SORT AN ARRAY
// public class ArraysPractice{
//     public static void main(String[] args) {
//         int[] arr={4,5,2,6,1};
//         int max=arr[0];
//         for(int i=0;i<5;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         int largest=arr[0];
        
//         for(int i=0;i<5;i++){
//             if(arr[i]>largest && arr[i]!=max){
//                 largest=arr[i];
//             }
//         }
//         System.out.println(largest);
//     }
// }

// public class ArraysPractice{
//     public static void main(String[] args) {
//         int[] arr={5,4,2,6,1};
//         int temp=0;
//         int n=5;
//         for(int i=0;i<5;i++){
//             for(int j=i+1;j<5;j++){
//                 if(arr[i]>arr[j]){
//                   temp=arr[i];
//                   arr[i]=arr[j];
//                   arr[j]=temp; 
//                 }
//             }
//         }
//         for(int i=0;i<5;i++){
//             System.out.println(arr[i]);
//         }
//         System.out.println(arr[n-2]);
//     }
// 
// public class ArraysPractice{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5};
//         int k=2;
//         int n=5;
//         int i=0,j=0;
//         for( i=k,j=0;i<n;i++,j++){
//             arr[j]=arr[i];
//         }
//         int p=0;
//         for(p=0;p<k;p++,j++){
//             arr[j]=arr[p];
//         }
    
//         for(int c=0;c<n;c++){
//             System.out.println(arr[c]);
//         }
        
//     }
// }

//import java.util.Scanner;

