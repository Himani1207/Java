
// public class practice1 {
//     public static void main(String[] args) {
//         int[] nums = {3, 4, 5, 12};
//         System.out.println(Arrays.toString(nums)); //we use arrays/tostring if we dont it will return some random value
//         change(nums); 
//         System.out.println(Arrays.toString(nums)); 
//     }

// static void change(int[] arr) { //we cant remove static if we do we have to make instance of this class
//         arr[0] = 1; 
//     }
// }
// import java.util.ArrayList;
import java.util.Scanner;

public class Arrayslist{
    public static void main(String[] args) {
        // ArrayList is a dynamic array
        Scanner inp = new Scanner(System.in); // `new` dynamically allocates memory for the object
        // ArrayList<Integer> list = new ArrayList<>(5); // Initial capacity of 5

        // list.add(3);
        // list.add(5);
        // list.add(7);
        // list.add(8);
    
   
        // list.set(2, 6);

        // System.out.println(list);
        int[] arr={1,3,23,9,18,36};
        System.out.println("Enter the starting indeex");
        int a=inp.nextInt();
        System.out.println("Enter the last index");
        int b=inp.nextInt();
        System.out.println("Enter the number you want to find");
        int n=inp.nextInt();
        for(int i=a;i<b;i++){
            if(arr[i]==n){
                System.out.println(i);
                break;
            }
        }
        System.out.println();
        inp.close();
    }
}

