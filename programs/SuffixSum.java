package programs;

import java.util.Arrays;

public class SuffixSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int[] suffixSum = new int[n];
        suffixSum[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            suffixSum[i] = arr[i] + suffixSum[i+1];
        }
        System.out.println(Arrays.toString(suffixSum));
    }
}
