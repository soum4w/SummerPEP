package programs;

import java.util.Arrays;

public class PrefixSumArray {
    public static void main(String[] args) {
        int[] arr = {2,4,3,1,6};
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for(int i=1; i<n; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(prefixSum));
    }
}
