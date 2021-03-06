package lesson1.l6_insertion_sort_advance;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

public class SortTest {

    @Test
    public void testSort1() throws Exception {
        int N = 10000;
        Integer[] data = SortTestHelper.generateRandomArray(N, 0, N);
        Integer[] cloneData = ArrayUtils.clone(data);
        System.out.println("优化前:");
        SortTestHelper.testSort(lesson1.l5_insertion_sort.InsertionSort.class, cloneData);
        System.out.println("优化后:");
        SortTestHelper.testSort(InsertionSort.class, data);
    }

    @Test
    public void testSort2() throws Exception {
        int N = 100000;
        Integer[] data = SortTestHelper.generateNearlyOrderedArray(N, 100);
        Integer[] cloneData = ArrayUtils.clone(data);
        SortTestHelper.testSort(InsertionSort.class, data);
        SortTestHelper.testSort(SelectionSort.class, data);
    }
}
