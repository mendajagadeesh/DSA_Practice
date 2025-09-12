import java.util.Arrays;

public class Move_all_zeros_toEnd {
    static int[] moveallzerostoend(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[count];
                arr[count]=arr[i];
                arr[i]=temp;
                count++;
            }
        }return arr;

    }
    public static void main(String args[]){

      int arr[]={1,3,0,4,5,0,6};
      System.out.println(Arrays.toString(moveallzerostoend(arr)));
    }
}
