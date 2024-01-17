import java.util.*;
public class bubbleSort {
    public static void getarray(int arr[]){
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = 0; j <arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
//                    swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
    }
//    print the eliments
    public static void printArr(int arr[]){
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
//    main function
    public static void main(String[] args) {
      int arr[] = {3,2,4,5,10};
        getarray(arr);
        printArr(arr);
    }
}
