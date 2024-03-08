import java.util.Scanner;
public class rotateArray {
    public static void RotateArray(int[] arr, int rotations) {
        int n = arr.length;
        rotations = rotations % n; // handle cases where rotations > n
        
        // Reverse the entire array
        reverseArray(arr, 0, n - 1);
        
        // Reverse the first 'rotations' elements
        reverseArray(arr, 0, rotations - 1);
        
        // Reverse the remaining elements
        reverseArray(arr, rotations, n - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input array
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Number of rotations
        System.out.println("Enter the number of rotations:");
        int rotations = scanner.nextInt();
        
        // Rotate the array
        RotateArray(arr, rotations);
        
        // Output the rotated array
        System.out.println("Rotated array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}