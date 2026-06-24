package Codes;

import java.util.Arrays;

public class RotateLeft {
    static void reverse(int[] arr, int left, int right){
        while(left<right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
    }

    static void rotateLeft(int[] arr, int k){
        int n = arr.length;
        k%=n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k);
        reverse(arr, k+1, n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotateLeft(arr,2);
        System.out.println(Arrays.toString(arr));
    }
}
