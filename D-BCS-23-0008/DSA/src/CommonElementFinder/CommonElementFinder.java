package CommonElementFinder;

import java.util.*;

public class CommonElementFinder {
    // Method to find common elements between two arrays
    public void findCommonElements(int[] array1, int[] array2) {
        // Sort both arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Initialize pointers for both arrays
        int pointer1 = 0, pointer2 = 0;

        System.out.println("Common elements between the two arrays:");
        // Iterate through both arrays to find common elements
        while (pointer1 < array1.length && pointer2 < array2.length) {
            if (array1[pointer1] == array2[pointer2]) {
                System.out.println(array1[pointer1]);
                pointer1++;
                pointer2++;
            } else if (array1[pointer1] < array2[pointer2]) {
                pointer1++;
            } else {
                pointer2++;
            }
        }
    }

    public static void main(String[] args) {
        // Sample arrays of integer values
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        // Create an instance of the CommonElements class
        CommonElementFinder cef = new CommonElementFinder();

        // Find and print common elements between the two arrays
        cef.findCommonElements(array1, array2);
    }
}

