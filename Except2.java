import java.util.*;
public class Except2{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int roll=obj.nextInt();
        try{
            validateroll(roll);
            System.out.println("valid roll no");
        }catch( MyCustomException e){
            System.out.println("Roll no cannot be neagtive");
        }
        
        obj.close();
    }
    private static void validateroll(int roll) throws MyCustomException{
        if(roll<0){
            throw new MyCustomException();

        }
    }
}
    
class MyCustomException extends Exception{
    MyCustomException(){
        super();
    }
}