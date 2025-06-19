package SortingService;

public class QuickSort {
    private int[] arr;

    public QuickSort(int[] arr) {
        this.arr = arr;
    }

    private int partition(int left, int right) {
        int pivot = arr[right];
        int r = right;
        right--;
        while (left < right) {
            while (left < right && arr[left] < pivot) {
                left++;
            }
            while (left < right && arr[right] > pivot) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        if (arr[left] > pivot) {
            int temp = arr[left];
            arr[left] = arr[r];
            arr[r] = temp;
        }

        return left;
    }

    private void sort(int left, int right) {
        if (left >= right)
            return;

        int x = partition(left, right);
        sort(left, x - 1);
        sort(x + 1, right);
    }

    public int[] quickSort() {
        sort(0, arr.length-1);
        return arr;
    }
}
