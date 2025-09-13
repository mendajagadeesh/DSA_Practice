import java.util.Arrays;

public class ArrayReverse {

    int[] arrayreverse(int arr[]){
        if(arr.length<2){
            return new int[]{-1};
        }
        int end=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[end];
            arr[end]=temp;
            end--;    
        }
        return arr;
    }
    public static void main(String args[]){
        ArrayReverse obj=new ArrayReverse();
       int[] arr={1,2,3,4,5};
       System.out.println("Before reverse"+Arrays.toString(arr));
       arr=obj.arrayreverse(arr);
       System.out.println("After reverse"+Arrays.toString(arr));
    
    }
}
