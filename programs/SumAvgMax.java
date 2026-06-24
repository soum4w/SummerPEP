package programs;

public class SumAvgMax {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for(int ele: arr) sum+= ele;
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + sum/arr.length);
        int max = Integer.MIN_VALUE;
        for(int ele: arr) max = Math.max(ele, max);
        System.out.println("Max: " + max);
    }
}
