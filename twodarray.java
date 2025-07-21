//compile time polymorphism: Early Binding
//run time: Late Binding
//import java.util.Scanner;
//PRINTING 2D ARRAY
// public class twodarray{
//     public static void main(String[ ] args){
//         Scanner in=new Scanner(System.in);
//         int[][] matrix=new int[2][2];
//         for(int i=0;i<2;i++){
//             for(int j=0;j<2;j++){
//                 matrix[i][j]=in.nextInt();
//             }
//         }
//         for(int i=0;i<2;i++){
//             for(int j=0;j<2;j++){
//                 System.out.print(matrix[i][j]);
//             }
//         }
//         in.close();
//     }
// }

//PRINT ROWWISE SUM
// public class twodarray{
//     public static void main(String[] args){
//         Scanner in=new Scanner(System.in);
//         int[][] matrix=new int[3][3];
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 matrix[i][j]=in.nextInt();
//             }
//         }
//         for(int i=0;i<3;i++){
//             int sum=0;
//             for(int j=0;j<3;j++){
//                 sum+=matrix[i][j];
                
//             }
//             System.out.println(sum);
//         }
//         in.close();
//     }
// }


//PRINT MAXIMUM ELEMENT IN MATRIX
// public class twodarray{
//     public static void main(String[] args){
//         Scanner in=new Scanner(System.in);
//         int[][] matrix=new int[3][3];
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 matrix[i][j]=in.nextInt();
//             }
//         }
//         int max=matrix[0][0];
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 if(matrix[i][j]>max){
//                     max=matrix[i][j];
//                 }
//             }
//         }
//         System.out.println(max);
//         in.close();
//     }
// }

//TRANSPOSE OF MATRIX
// public class twodarray{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int[][] matrix=new int[3][3];
//         for(int i=0;i<3;i++){
//           for(int j=0;j<3;j++){
//                  matrix[i][j]=in.nextInt();
//             }
//         }
//         int[][] b=new int[3][3];
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 b[i][j]=matrix[j][i];
//             }
//         }
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 System.out.print(b[i][j]+" ");
//             }
//             System.out.println();
//         }
//         in.close();

//     }
// }

//ROTATE MATRIX 
// public class twodarray{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int[][] matrix=new int[3][3];
//         int[][] b=new int[3][3];
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 matrix[i][j]=in.nextInt();
//             }
//         }
//         int n=3;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 b[i][j]=matrix[n-1-j][i];
//             }
//         }
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 System.out.print(b[i][j]+" ");
//             }
//             System.out.println();
            
//         }
//         in.close();

//     }
// }


//SUM OF DIAGONAL 
// public class twodarray{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int n=in.nextInt();
//         int[][] matrix=new int[n][n];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 matrix[i][j]=in.nextInt();
//             }
//         }
//         int Sum=0;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if(i==j){
//                     Sum+=matrix[i][j];
//                 }
//                 if((i+j)%2==0 && i!=j){
//                     Sum+=matrix[i][j];
//                 }
//             }
//         }
//         System.out.println(Sum);
//         in.close();
//     }
// }

//Find column with maximum sum

// public class twodarray {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int[][] matrix = new int[3][3];

//         // Input
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 matrix[i][j] = in.nextInt();
//             }
//         }

//         int[] total = new int[3]; 
//         int max = Integer.MIN_VALUE; //store max sum
//         int maxColIndex = -1; 

        
//         for (int i = 0; i < 3; i++) {
//             int sum = 0; 
//             for (int j = 0; j < 3; j++) {
//                 sum += matrix[j][i];
//             }
//             total[i] = sum;

//             if (sum > max) {
//                 max = sum;
//                 maxColIndex = i;
//             }
//         }

        
//         System.out.println("Maximum column sum: " + max);
//         System.out.println("Column index: " + maxColIndex);
        
//         in.close();
//     }
// }
