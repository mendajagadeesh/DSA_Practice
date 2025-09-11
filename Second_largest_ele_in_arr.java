public class Second_largest_ele_in_arr{

    void secondLargest(int[] arr){
        int first=arr[0];
        int second=Integer.MIN_VALUE;
        if(arr.length<2){
            return;
        }
        for(int i=0;i<arr.length;i++){
           if(arr[i]>first){
            second=first;
            first=arr[i];
           }
           else if(arr[i]>second && arr[i]!=first){
            second=arr[i];
           }
        }

        System.out.println("Second largest element is : "+second);
        
    }
    public static void main(String args[]){
     int arr1[]={10,5,10};
     int arr2[]={1,2,3,4,5,6,7,8,9};
     Second_largest_ele_in_arr obj=new Second_largest_ele_in_arr();
     obj.secondLargest(arr1);
     obj.secondLargest(arr2);
    }
}