package SortingService;

public class MergeSort {
    private int[] arr;

    public MergeSort(int[] arr) {
        this.arr = arr;
    }

    public void merge(int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[right - left + 1];

        while (i <= mid && j <= right)
            if (arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= right)
            temp[k++] = arr[j++];

        for (int t = 0; t < temp.length; t++)
            arr[left + t] = temp[t];

    }

    private void sort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(left, mid);
            sort(mid + 1, right);

            merge(left, mid, right);
        }
    }

    public int[] mergeSort() {
        sort(0, arr.length - 1);
        return arr;
    }
}
