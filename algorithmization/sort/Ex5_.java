package algorithmization.sort;

import java.util.Arrays;
import java.util.Random;

public class Ex5_ {
    public static int search(int[] array, int key, int low, int high) {
        int index = 0;
        int mid = 0;
        while (low <= high) {
            mid = low + ((high - low) / 2)+ ((high - low) % 2);
            System.out.println("Mid = "+mid);
            if (array[mid] < key) {
                low = mid + 1;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else
                break;
        }
        index = mid;
        return index;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,1,3,6,10,7,5,4,8,9};

        System.out.println("Original array:" + Arrays.toString(a));
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println(Arrays.toString(a));
            int n = a[i + 1];
            int ent = search(a, n, 0, i + 1);
            for (int f = i; f > ent; f--) {
                a[f] = a[f - 1];
            }
            a[ent] = n;
        }
        System.out.println("New array:" + Arrays.toString(a));
    }
}
