package Sorting;

public class Quick_sort {
    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pindex = fun(arr, low, high);
            quicksort(arr, low, pindex - 1);
            quicksort(arr, pindex + 1, high);
        }
    }

    private static int fun(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        int temp;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 4, 2, 1, 6, 7};

        System.out.println("Before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        quicksort(arr, 0, arr.length - 1);

        System.out.println("After sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
