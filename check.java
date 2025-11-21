import java.util.Scanner;
// public class check{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         boolean flag=false;
//         // for(int i=1;i<n;i++){
//         //     for(int j=0;j<n;j++){
//         //     if(arr[i]==arr[j]){
//         //         flag=true;
//         //         break;
//         //     }
//         // }

//         //}

//         int f=0;
//         int l=arr.length-1;
//         while(f<l){
//             if(arr[f]==arr[l]){
//                 flag=true;
//             }
//             f++;
//             l--;
//         }
//         System.out.println(flag);
//     }
// }


// public class check{
//     static  int binarysearch(int[] arr,int target){
//         int st=0;
//         int end=arr.length-1;
//         while(st<=end){
//             int mid=st+(end-st)/2;
//             if (arr[mid] == target) {
//     return mid;
// }
// if (arr[st] <= arr[mid]) {
//     if (arr[st] <= target && target < arr[mid]) {
//         end = mid - 1;
//     } else {
//         st = mid + 1;
//     }
// } else {
//     if (arr[mid] < target && target <= arr[end]) {
//         st = mid + 1;
//     } else {
//         end = mid - 1;
//     }
// }
            
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//        // int target=sc.nextInt();
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int target=sc.nextInt();
        
//         System.out.println(binarysearch(arr,target));
//         sc.close();
        
//     }
// }

public class check{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] price=new int[n];

        for(int i=0;i<n;i++){
            price[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<n;i++){
            if(price[i]<min){
                min=price[i];
            }
            else{
                int profit=price[i]-min;
                if(profit>max){
                    max=profit;
                }
            }
        }
        System.out.println(max);
    }
}