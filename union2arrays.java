package union2arrays;
public class union2arrays
{
	public static int[] findUnion(int[] arr1, int[] arr2, int n, int m)
	{
        int[] tempUnion = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m)
        {
            while (i > 0 && i < n && arr1[i] == arr1[i - 1])
            	i++;
            while (j > 0 && j < m && arr2[j] == arr2[j - 1])
            	j++;
            if (i < n && j < m)
            {
                if (arr1[i] < arr2[j])
                    tempUnion[k++] = arr1[i++];
                else if (arr1[i] > arr2[j])
                    tempUnion[k++] = arr2[j++];
                else
                {
                    tempUnion[k++] = arr1[i];
                    i++;
                    j++;
                }
            }
        }
        while (i < n)
        {
            while (i > 0 && i < n && arr1[i] == arr1[i - 1])
            	i++;
            if (i < n)
            	tempUnion[k++] = arr1[i++];
        }
        while (j < m)
        {
            while (j > 0 && j < m && arr2[j] == arr2[j - 1])
            	j++;
            if (j < m)
            	tempUnion[k++] = arr2[j++];
        }
        int[] union = new int[k];
        for (int x = 0; x < k; x++)
            union[x] = tempUnion[x];
        return union;
    }
    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 6, 7};
        int n = arr1.length;
        int m = arr2.length;
        int[] union = findUnion(arr1, arr2, n, m);
        System.out.print("Union of arrays: ");
        for (int num : union) {
            System.out.print(num + " ");
        }
    }
}