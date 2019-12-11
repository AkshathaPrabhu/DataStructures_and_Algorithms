package Algorithms.search_algos;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {
    public static void main(String[] args) throws IOException {
        //taking only a sorted array into consideration
        int arr[] = {1, 25, 45, 62, 65};

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter element to binary search : ");
        int search = Integer.parseInt(buf.readLine());

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (search == arr[mid]) {
                System.out.println("Element is present at " + mid + " index");
                break;
            } else if (search < arr[mid]) {
                high = mid - 1;
            } else if (search > arr[mid]) {
                low = mid + 1;
            }

        }

        if (low > high) {
            System.out.println("Element not found");
        }
    }
}
