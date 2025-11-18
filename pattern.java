import java.util.*;
public class pattern{
    public static void main(String[] args) {
        int n=3;
        String A="Source", B="Helper", C="Target";
        ArrayList<String> result=new ArrayList<>();
        toh(n,A,B,C,result);

        for(String s: result){
            System.out.println(s);
        }
    }
    public static void toh(int n,String A,String B,String C,ArrayList<String> result){
        if(n==1){
            result.add("Put Disk no "+n+" from "+A+" to "+C);
            return;
        }
        
        toh(n-1,A,C,B,result);
        result.add("Put Disk no "+n+" from "+A+" to "+C);
        toh(n-1, B,A,C, result);

    }
}