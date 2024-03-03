import java.util.ArrayList;
public class leadersarray
{
	public static ArrayList<Integer> arrayleader(int[] arr, int n)
	{
		ArrayList<Integer> result = new ArrayList<>();
        int maxRight = arr[n - 1];
        result.add(maxRight);
        for (int i = n - 2; i >= 0; i--)
        {
            if (arr[i] >= maxRight)
            {
                maxRight = arr[i];
                result.add(maxRight);
            }
        }
        int left = 0;
        int right = result.size() - 1;
        while (left < right)
        {
            int temp = result.get(left);
            result.set(left, result.get(right));
            result.set(right, temp);
            left++;
            right--;
        }
		return result;
	}
	public static void main(String[] args)
	{
		int[] arr1 = {16, 17, 4, 3, 5, 2};
        int n1 = arr1.length;
        System.out.println("Example 1 Output: " + arrayleader(arr1, n1));
        
        int[] arr2 = {1, 2, 3, 4, 0};
        int n2 = arr2.length;
        System.out.println("Example 2 Output: " + arrayleader(arr2, n2));
	}
}