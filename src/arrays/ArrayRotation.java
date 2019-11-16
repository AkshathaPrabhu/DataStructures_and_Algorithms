package arrays;

/**
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 * i.e.
 * <p>
 * Rotation of {1, 2, 3, 4, 5, 6}   by 2 should be = {3, 4, 5, 6, 1, 2}
 */


public class ArrayRotation {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        int rotate[] = rotate(arr, 3, arr.length);

        for (int i : rotate) {
            System.out.println(i);
        }


    }

    public static int[] rotate(int arr[], int d, int n) {

        for (int i = 0; i < d; i++) {
            int temp = arr[0];
            int j;
            for (j = 0; j < n - 1; j++) {    // here j has to be less than n-1, because that many rotations can happen
                //System.out.println("j= " + j + "and n = " + n);
                arr[j] = arr[j + 1];
            }
            arr[j] = temp;
        }

        return arr;

    }
}
