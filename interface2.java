interface ABC{
    int addandreturn(int a,int b);
    // void show();
}
// class DEF implements ABC{
//     @Override
//     public int addandreturn(int a,int b){
//         return a+b;
//     }
// }
public class interface2 {
    public static void main(String args[]){
        ABC obj=(a,b)->a+b;
        int res=obj.addandreturn(2,3 );
        System.out.println(res);
    }
    
}