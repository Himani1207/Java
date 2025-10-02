import java.util.Scanner;
class Invalidage extends Exception{
    public Invalidage(String message){
        super(message);
    }
}
public class CustomException{
    static void checkage (int age) throws Invalidage {
        if(age<18){
            throw new Invalidage("Underage");
        }
        else{
            System.out.println("Age is valid "+age);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        try{
            checkage(age);
        }catch(Invalidage e){
            System.out.println(e.getMessage());
        }
    }
}