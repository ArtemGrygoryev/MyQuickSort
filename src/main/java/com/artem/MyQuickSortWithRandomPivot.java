package com.artem;

public class MyQuickSortWithRandomPivot {
    private static int[] array;

    private MyQuickSortWithRandomPivot() {
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
        int random = left + (int) (Math.random() * ((right - left) + 1));
        int temp = array[random];
        array[random] = array[right];
        array[right] = temp;
        int i = left - 1;
        for (int j = left; j <= right; j++) {
            if (array[j] <= array[right]) {
                i++;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return i;
    }
}
