// import java.util.Scanner;
// public class rock {
//     public static  void main(String[] args) {
//         Scanner Sc = new Scanner(System.in);
//         System.out.println("0 to exit\n 1 for rock \n 2 for scissor \n 3 for paper");
//         while(true){
//             int user_choice = Sc.nextInt();
//             if(user_choice==0) break;
//             int comp_choice = ((int)(Math.random()*3))+1;
//             if(user_choice==comp_choice) System.out.println("draw");
//             else if((user_choice==1 && comp_choice==2) || (user_choice==2 && comp_choice==3) || (user_choice==3 && comp_choice==1)) 
//             System.out.println("win");
//             else System.out.println("lose");
//         }
//     }
// }

// using random function print table
// public class random {
//     public static void main(String[] args) {
//         int rand = (int)(Math.random()*100);

//         for(int i=1;i<=10;i++){
//             System.out.println(rand + "x" + i + " = " + rand*i);
//         }
//     }
// }

// import java.util.Random;

// public class arth {
//     public static void main(String[] args) {
//         Random rand  = new Random();
//         int number1 = rand.nextInt(1,101);
//         int number2 = rand.nextInt(1,101);
//         int opp = rand.nextInt(5);
//         System.out.println(number1 + " " + number2 + " " + opp);

//         if(opp==0) System.out.println(number1+number2);
//         if(opp==1) System.out.println(number1-number2);
//         if(opp==2) System.out.println(number1*number2);
//         if(opp==3) System.out.println(number1/number2);
//         if(opp==4) System.out.println(number1%number2);
//     }
// }


import java.util.Random;

public class relation {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(1,101);
        int num2 = rand.nextInt(1,101);
        int opp = rand.nextInt(4);
        System.out.println(num1 + " " + num2 + " " + opp);

        switch (opp) {
            case 0:
                System.out.println(num1==num2);
                break;
            case 1:
                System.out.println(num1>num2);
                break;
            case 2:
                System.out.println(num1<num2);
                break;
            case 3:
                System.out.println(num1!=num2);
                break;
            
        }
    }

}
