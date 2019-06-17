package demo;

import demo.algorithm.BaseSort;
import demo.algorithm.SortMethod;

public class Application {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] { 3, 4, 5, 12, 3, 123, 1, 1, 23, 0, 556, 78, 9780, 45, 6345,
                63, 12, 312, 3123 };

        BaseSort sort = BaseSort.getInstance(SortMethod.INSERTION_SORT);

        sort.sort(arr);
    }
}
