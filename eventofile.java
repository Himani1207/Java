//import java.io.File;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//import java.util.Scanner;
public class eventofile{
    public static void main(String[] args) {
        // //File file=new File("Example.txt");
        try{
            File file=new File("Even.txt");
            if(file.createNewFile());
            FileWriter writer =new FileWriter("Even.txt");
            
            for(int i=0;i<30;i++){
                if(i%2==0){
                    writer.write(i+" ");
                }
            }
            writer.close();
        }catch(IOException e){
            System.out.println("Error in writing");
        }
    //     try{
    //    File file=new File("Example.txt");
    //    Scanner sc=new Scanner(file);
    //     int count=0;
    //    while(sc.hasNextLine()){
    //     sc.nextLine();
    //     count++;
    //    }
    //      System.out.println(count);
    // }catch(IOException e){
    //     System.out.println("error");
    // }

    // try{
    //     File file=new File("Example.txt");
    //     Scanner sc=new Scanner(file);

    //     while(sc.hasNextLine()){
    //        String data= sc.nextLine();
    //        String rev=new StringBuilder(data).reverse().toString();
    //        System.out.println(rev);

    //     }

    // }catch(IOException e){
    //     System.out.println("Error");

    // }
     
    }
}