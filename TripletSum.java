import java.util.Arrays;
public class TripletSum {
    public static void findTriplet(int[] arr, int sum) {
        Arrays.sort(arr); // Sort the array
        
        int n = arr.length;
        
        // Fix the first element and find other two elements
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                if (arr[i] + arr[left] + arr[right] == sum) {
                    System.out.println("Triplet found: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                    return;
                } else if (arr[i] + arr[left] + arr[right] < sum)
                    left++;
                else
                    right--;
            }
        }
        
        System.out.println("No triplet found");
    }
    
    public static void main(String[] args) {
        int[] arr1 = {12, 3, 4, 1, 6, 9};
        int sum1 = 24;
        findTriplet(arr1, sum1);
        
        int[] arr2 = {1, 2, 3, 4, 5};
        int sum2 = 9;
        findTriplet(arr2, sum2);
    }
}