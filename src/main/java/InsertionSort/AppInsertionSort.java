package InsertionSort;

public class AppInsertionSort {

    public static void main(String[] args) {
        int[] myArr = insertionSort(new int[] {9,8,5,10,11,3});
        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }
    }

    public static int[] insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int element = a[i]; // Element contains the data we intend on bringing over to the sorted area
            int j = i - 1; // Variable points to the index position of the last value in the sorted area
            while (j >= 0 && a[j] > element) {
                a[j + 1] = a[j]; // Overrides index j + 1, but 'element' keeps reference to a[i], so it's not lost
                j--; // When j is 0, it then returns -1 and does not meet the while loop condition, so we step out of the loop
            }
            a[j + 1] = element; // j + 1 is basically index i position
        }
        return a;
    }
}
