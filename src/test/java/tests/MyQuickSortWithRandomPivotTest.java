package tests;

import com.artem.MyQuickSortWithRandomPivot;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MyQuickSortWithRandomPivotTest {
    @Test
    public void sortShouldHandleEmptyArray() {
        int[] array = new int[0];
        MyQuickSortWithRandomPivot.sort(array);
        assertArrayEquals(array, new int[0]);
    }

    @Test
    public void sortShouldHandleOneElement() {
        int[] array = {1};
        MyQuickSortWithRandomPivot.sort(array);
        assertArrayEquals(array, new int[]{1});
    }

    @Test
    public void sortShouldHandleTwoElements() {
        int[] array = {2, 1};
        MyQuickSortWithRandomPivot.sort(array);
        assertArrayEquals(array, new int[]{1, 2});
    }

    @Test
    public void sortShouldHandleThreeElements() {
        int[] array = {3, 2, 1};
        MyQuickSortWithRandomPivot.sort(array);
        assertArrayEquals(array, new int[]{1, 2, 3});
    }

    @Test
    public void sortShouldHandleEvenAmountOfElements() {
        int[] array = {3, 2, 1, 6};
        MyQuickSortWithRandomPivot.sort(array);
        assertArrayEquals(array, new int[]{1, 2, 3, 6});
    }

    @Test
    public void sortShouldHandleOddAmountOfElements() {
        int[] array = {3, 2, 1, 4, 5};
        MyQuickSortWithRandomPivot.sort(array);
        assertArrayEquals(array, new int[]{1, 2, 3, 4, 5});
    }

    @Test
    public void sortShouldHandleRepeatingElements() {
        int[] array = {3, 3, -1, -1, -1, 6, 6, 6, 5};
        MyQuickSortWithRandomPivot.sort(array);
        assertArrayEquals(array, new int[]{-1, -1, -1, 3, 3, 5, 6, 6, 6});
    }
}
