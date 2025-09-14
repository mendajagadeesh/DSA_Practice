import java.util.Arrays;

public class Rotate_array_nSteps {

    int[] rotatearray(int[] arr,int start,int end){
          if(arr.length==0)return new int[]{-1};
          while(start<end){
          int temp=arr[start];
          arr[start]=arr[end];
          arr[end]=temp;
          start++;
          end--;
          }
          return arr;
    }
    public static void main(String args[]){
     Rotate_array_nSteps obj=new Rotate_array_nSteps();
        int[] arr={1,2,3,4,5};
        int n=2;//no of steps you want to rotate
        int totalsize=arr.length-1;
       arr=obj.rotatearray(arr,0,n%totalsize-1);//n%totalsize-1 gives the index of second element in an array
       arr=obj.rotatearray(arr,n,totalsize);
       int[] res= obj.rotatearray(arr,0,totalsize);
        System.out.println(Arrays.toString(res));

    }
}
