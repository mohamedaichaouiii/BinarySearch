import java.util.Arrays;

public class SearchExample {

    // Linear Search Method
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // Target found, return index
            }
        }
        return -1;  // Target not found
    }

    // Binary Search Method
    // Note: Binary search works only on sorted arrays
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;  // Calculate middle index

            if (arr[mid] == target) {
                return mid;  // Target found, return index
            } else if (arr[mid] < target) {
                low = mid + 1;  // Search the right half
            } else {
                high = mid - 1;  // Search the left half
            }
        }
        return -1;  // Target not found
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70};
        int target = 40;

        // Linear Search
        int linearResult = linearSearch(array, target);
        if (linearResult != -1) {
            System.out.println("Linear Search: Element found at index " + linearResult);
        } else {
            System.out.println("Linear Search: Element not found");
        }

        // Binary Search (Array needs to be sorted for binary search)
        Arrays.sort(array);  // Ensuring the array is sorted
        int binaryResult = binarySearch(array, target);
        if (binaryResult != -1) {
            System.out.println("Binary Search: Element found at index " + binaryResult);
        } else {
            System.out.println("Binary Search: Element not found");
        }
    }
}
