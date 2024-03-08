import java.util.*;
public class CommonElements {
    public static void findCommon(int ar1[], int ar2[], int ar3[]) {
        int n1 = ar1.length, n2 = ar2.length, n3 = ar3.length;
        ArrayList<Integer> result = new ArrayList<>();
        
        int i = 0, j = 0, k = 0;
        
        while (i < n1 && j < n2 && k < n3) {
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                result.add(ar1[i]);
                i++;
                j++;
                k++;
            } else if (ar1[i] < ar2[j]) {
                i++;
            } else if (ar2[j] < ar3[k]) {
                j++;
            } else {
                k++;
            }
        }
        
        System.out.println("Common Elements: " + result);
    }
    
    public static void main(String[] args) {
        int ar1[] = {1, 5, 10, 20, 40, 80};
        int ar2[] = {6, 7, 20, 80, 100};
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
        findCommon(ar1, ar2, ar3);
        
        int ar4[] = {1, 5, 5};
        int ar5[] = {3, 4, 5, 5, 10};
        int ar6[] = {5, 5, 10, 20};
        findCommon(ar4, ar5, ar6);
    }
}