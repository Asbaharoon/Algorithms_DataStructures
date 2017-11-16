package QuickSort;

import java.util.Arrays;

public class AppQuickSort {

    public static void main(String[] args) {
        int[] inputArray = { 12,81,74,43,1098,0,8};
        quickSort(inputArray, 0, inputArray.length - 1);

        System.out.println(Arrays.toString(inputArray));
    }

    public static void quickSort(int[] inputArray, int start, int end) {
        if (start < end) {
            int partitionPoint = partition(inputArray, start, end); // Index position of the correctly placed value in array
            quickSort(inputArray, start, partitionPoint - 1); // sorts the Left half of the range
            quickSort(inputArray, partitionPoint + 1, end); // Sorts the Right Half of the range
        }
    }

    public static int partition(int[] inputArray, int start, int end) {

        int pivot = inputArray[end];
        // In the first iteration, i starts from -1
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (inputArray[j] <= pivot) {
                // Swapping the i and j values
                i++;
                int iVal = inputArray[i];
                int jVal = inputArray[j];
                inputArray[i] = jVal;
                inputArray[j] = iVal;
            }
        }

        // put the pivot value in the correct slot next
        int iVal = inputArray[i + 1];
        inputArray[end] = iVal;
        inputArray[i + 1] = pivot;

        return i + 1;
    }
}
