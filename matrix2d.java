// import java.util.Scanner;
// public class matrix2d{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[][] arr=new int[n][n];
//         int[][] brr=new int[n][n];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//          for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 brr[i][j]=sc.nextInt();
//             }
//         }
//         int[][] c=new int[n][n];
//         for(int i=0;i<n;i++){ 
            
//             for(int j=0;j<n;j++){
//                 c[i][j]=0;
//                 for(int k=0;k<n;k++){
//                     c[i][j]+=arr[i][k]*brr[k][j];

//                 }
//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(c[i][j]+" ");
//             }
//             System.out.println();
//         }

//     }
// }

import java.util.Scanner;

public class matrix2d{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    //int[][] b=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=i+1;j<n;j++ ){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}