import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;

public class filehandling{
    public static void main(String[] args){
       File file=new File("Example.txt");
        try{
        if(file.createNewFile()){
            System.out.println("File created");
        }   
        else{
            System.out.println("Already existed");
        }    
    }catch(IOException e){
        System.out.println("Error in making file");
        e.printStackTrace();
    }
    try{
    FileWriter writer=new FileWriter("Example.txt");
    writer.write("HEllo this is file \n Java is nice");

    writer.close();
    }catch(IOException e){
        System.out.println("error in writing");
    }

    //try{
    // File file=new File("example.txt");
    // Scanner sc=new Scanner(file);
    // while(sc.hasNextLine()){
    //     String data=sc.nextLine();
    //     System.out.println(data);
    // }
    // sc.close();
    // }catch(IOException e){
    //     System.out.println("Error in reading");
    // }
    }
}
