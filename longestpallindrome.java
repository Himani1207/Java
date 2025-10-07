import java.util.Scanner;

public class longestpallindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int n=s.length();
        int j=s.length()-1;
        int count=0;
        int index=0;
        if(n%2==0){
        for(int i=0;i<n/2+1;i++){
            if(s.charAt(i)==s.charAt(j)){
                count++;
                index=i;
            }
            j--;
            
        }
    }else{
          for(int i=0;i<n/2+1;i++){
            if(s.charAt(i)==s.charAt(j)){
                count++;
                index=i+1;
            }
            j--;
            
        }
    }
        System.out.println(s.substring(index-count, index+count));
    }
}