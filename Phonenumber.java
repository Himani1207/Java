import java.util.Scanner;

public class Phonenumber{
    public static void combination(String dig,String[] kp,String result){
        if(dig.length()==0){
            System.out.print(result+" ");
            return ;
        }

        int current=dig.charAt(0)-'0';
        String choice=kp[current];
        for(int i=0;i<choice.length();i++)
        {
            combination(dig.substring(1),kp,result+choice.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] kp={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(str,kp,"");
    }
}
