package Algorithms.search_algos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearSearch {
    public static void main(String[] args) throws IOException {

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter how many nums. in the array");
        int size = Integer.parseInt(buf.readLine());

        int arr[] = new int[size];

        System.out.println("Enter the nums.");
        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(buf.readLine());
            arr[i] = num;
        }

        System.out.println("Enter a num. to search in the array : ");
        int num = Integer.parseInt(buf.readLine());


        int i = linearSearch(arr, num);
        if (i == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element is present at index : " + i);


    }

    private static int linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
