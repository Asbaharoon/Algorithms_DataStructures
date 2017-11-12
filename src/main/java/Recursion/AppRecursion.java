package Recursion;

public class AppRecursion {

    public static void main(String[] args) {
        System.out.println(recursiveLinearSearch(new int[] {1,2,3,4,5,6,7,8,9,10}, 0, 10));
    }

    public static void reduceByOne(int n) {
        if (n >= 0) {
            reduceByOne(n - 1);
        }
        System.out.println("Completed: " + n);
    }

    public static int recursiveLinearSearch(int [] a, int i, int x) {
        if (i > a.length - 1) { // If i = 0, then no elements in the array left
            return -1;
        } else if (a[i] == x) {
            return i;
        } else {
            System.out.println("Index at: " + i);
            return recursiveLinearSearch(a, i + 1, x);
        }
    }
}
