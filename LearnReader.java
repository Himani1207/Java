import java.io.*;

import javax.print.DocFlavor.READER;
//import java.util.*;
public class LearnReader  {
    public static void main(String[] args) throws IOException {
        File f=new File("g6.txt");
        f.createNewFile();


        Reader fr=new FileReader("g6.txt");
        int i=fr.read();
        while(i!=-1){
            System.out.println((char)i);
            i=fr.read();
        }

        //Reader fr1=new FileReader(null);
    }
}