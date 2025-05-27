import SortingService.*;

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
        System.out.println("3. Insertion Sort");
        System.out.println("4. Merge Sort");
        System.out.println("5. Quick Sort");
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
            case 3: {
                InsertionSort is = new InsertionSort();
                System.out.println(Arrays.toString(is.insertionSort(arr)));
                break;
            }
            case 4: {
                MergeSort ms = new MergeSort();
                System.out.println(Arrays.toString(ms.mergeSort(arr)));
                break;
            }
            case 5: {
                QuickSort qs = new QuickSort();
                System.out.println(Arrays.toString(qs.quickSort(arr)));
                break;
            }
            default: {
                System.out.println("Invalid option");
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}