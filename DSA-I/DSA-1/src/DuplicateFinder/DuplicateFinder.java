package DuplicateFinder;

import java.util.Arrays;

public class DuplicateFinder {
    // Method to find duplicate elements in an array
    public static void findDuplicates(int[] array) {
        // Sort the array to bring duplicate elements together
        Arrays.sort(array);

        // Iterate through the sorted array to find duplicates
        System.out.println("Duplicate elements in the array:");
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        // Sample array of integer values
        int[] array = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 4, 9, 10, 5};

        // object Creation
        DuplicateFinder duplicates = new DuplicateFinder();
        duplicates.findDuplicates(array);
    }
}
