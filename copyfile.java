import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class copyfile{
    public static void main(String[] args) {
        try{
            File reed=new File("Even.txt");
            File writ=new File("Example.txt");

            Scanner sc=new Scanner(reed);
            FileWriter wri=new FileWriter(writ);

            while(sc.hasNextLine()){
                String data=sc.nextLine();
                wri.write(data+"\n");
            }
            wri.close();
            sc.close();
        }catch(IOException e){
            System.out.println("Error");
        }
    }
}