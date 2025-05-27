import SortingService.BubbleSort;
import SortingService.SelectionSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[] {1, 9, 3, 8, 5, 2, 1, 7, 6, 4};
        System.out.println("Select the following options to sort: " + Arrays.toString(arr));
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        String s = br.readLine();
        int n = Integer.parseInt(s);

        switch (n) {
            case 1: {
                BubbleSort bs = new BubbleSort();
                System.out.println(Arrays.toString(bs.bubbleSort(arr)));
                break;
            }
            case 2: {
                SelectionSort ss = new SelectionSort();
                System.out.println(Arrays.toString(ss.selectionSort(arr)));
                break;
            }
            default: {
                System.out.println("Invalid option");
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}