import java.util.Arrays;
public class MinimumSwaps {
    public static int minSwaps(int[] nums) {
        int n = nums.length;
        int swaps = 0;
        int[][] arrPos = new int[n][2];
        for (int i = 0; i < n; i++) {
            arrPos[i][0] = nums[i];
            arrPos[i][1] = i;
        }
        Arrays.sort(arrPos, (a, b) -> Integer.compare(a[0], b[0]));
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] || arrPos[i][1] == i)
                continue;
            
            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = arrPos[j][1];
                cycleSize++;
            }
            
            if (cycleSize > 0) {
                swaps += (cycleSize - 1);
            }
        }
        
        return swaps;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 8, 5, 4};
        System.out.println("Minimum swaps for nums1: " + minSwaps(nums1)); // Output: 1
        
        int[] nums2 = {10, 19, 6, 3, 5};
        System.out.println("Minimum swaps for nums2: " + minSwaps(nums2)); // Output: 2
    }
}