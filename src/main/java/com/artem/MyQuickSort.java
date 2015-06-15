package com.artem;

public final class MyQuickSort {
    private static int[] array;

    private MyQuickSort() {
    }

    public static void sort(int[] unsortedArray) {
        if (unsortedArray.length < 2)
            return;
        array = unsortedArray;
        quickSort(0, array.length - 1);
        array = null;
    }

    private static void quickSort(int left, int right) {
        if (left < right) {
            int divider = partition(left, right);
            quickSort(left, --divider);
            quickSort(++divider, right);
        }
    }

    private static int partition(int left, int right) {
        int i = left - 1;
        for (int j = left; j <= right; j++) {
            if (array[j] <= array[right]) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return i;
    }
}
