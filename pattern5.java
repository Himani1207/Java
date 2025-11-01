package pattern;
public class pattern5{
    public static void print(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println( );
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-1;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
        }
    }
    public static void main(String[] args){
        print(4);
    }
}