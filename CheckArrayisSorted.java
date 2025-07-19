public class CheckArrayisSorted{
    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,3,4};
        boolean issorted=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){

            }
            else{
                issorted=false;
            }
        }
        System.out.println(issorted);
    }
}
