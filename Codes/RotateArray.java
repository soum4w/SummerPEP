package Codes;

import java.util.Arrays;

public class RotateArray {

    static void reverse(int[]arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotate(int[] arr, int k){

        int n = arr.length;
        k%=n;

        //reverse 
        reverse(arr, 0, n-1);

        //reverse k
        reverse(arr, 0, k-1);

        //reverse remaining
        reverse(arr, k, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
