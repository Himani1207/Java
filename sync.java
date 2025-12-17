class someotherclass{
    public void printNum(){
        for(int i=0;i<25;i++){
            System.out.println("Something "+i);
        }
    }
}
class customThread extends Thread{
    someotherclass obj;
    String str="hello";
    
    @Override
    public void run(){
        synchronized (str){ 
            obj.printNum();
        }
    }
    customThread(someotherclass obj){
        this.obj=obj;
    }
}
public class sync {
    public static void main(String[] args){
        someotherclass obj=new someotherclass();
        Thread t1=new customThread(obj);
        Thread t2=new customThread(obj);

        t1.start();
        t2.start();
    }
}