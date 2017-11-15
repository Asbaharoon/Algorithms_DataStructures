package MergeSort;

public class MergeSort {

    public static void sort(int inputArray[]) {
        sort(inputArray, 0, inputArray.length - 1);
    }

    public static void sort(int inputArray[], int start, int end) {
        if (end <= start) {
            return;
        }

        int mid = (start + end) / 2;
        sort(inputArray, start, mid); // Sort the Left Half
        sort(inputArray, mid + 1, end); // Sort the Right Half
        merge(inputArray, start, mid, end); // Merge Sorted results into inputArray
    }

    public static void merge(int inputArray[], int start, int mid, int end) {

        int tempArray[] = new int[end - start + 1];

        int leftSlot = start; // Index counter for the left side of the Array
        int rightSlot = mid + 1; // Index counter for the right side of the Array
        int k = 0;

        while (leftSlot <= mid && rightSlot <= end) {
            if (inputArray[leftSlot] < inputArray[rightSlot]) {
                tempArray[k] = inputArray[leftSlot];
                leftSlot = leftSlot + 1;
            } else {
                tempArray[k] = inputArray[rightSlot];
                rightSlot = rightSlot + 1;
            }
            k++;
        }

        //When code reaches here, this means the While Loop above hss finished
        // Both the Left and Right Sub Array are now sorted

        if (leftSlot <= mid) { // Consider the right side done being sorted, left must be sorted already
            while (leftSlot <= mid) {
                tempArray[k] = inputArray[leftSlot];
                leftSlot = leftSlot + 1;
                k++;
            }
        } else if (rightSlot <= end) {
            while (rightSlot <= end) {
                tempArray[k] = inputArray[rightSlot];
                rightSlot = rightSlot + 1;
                k++;
            }
        }

        // Copying over the Temp Array into the appropriate slots of the inputArray
        for (int i = 0; i < tempArray.length; i++) {
            inputArray[start + i] = tempArray[i];
        }
    }

}
