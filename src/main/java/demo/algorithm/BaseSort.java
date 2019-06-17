package demo.algorithm;

public abstract class BaseSort {

    public static BaseSort getInstance(SortMethod sortMethod) {
        switch (sortMethod) {
            case INSERTION_SORT:
                return new InsertionSort();
            case SELECTION_SORT:
                return new SelectionSort();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public void sort(Comparable[] arr) {
        long start = System.currentTimeMillis();
        print(arr);
        // sort arr.
        doSort(arr);
        // assert arr is sorted.
        assert isSorted(arr);
        print(arr);
        long end = System.currentTimeMillis();
        System.out.println(String.format("sort cost %d ms", end - start));
    }

    /**
     * exec sort.
     * 
     * @param arr target to sort.
     */
    abstract void doSort(Comparable[] arr);

    @SuppressWarnings("unchecked")
    boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    void exchange(Comparable[] arr, int i, int j) {
        Comparable tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private boolean isSorted(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (less(arr[i - 1], arr[i])) {
                return false;
            }
        }
        return true;
    }

    private void print(Comparable[] arr) {
        for (Comparable comparable : arr) {
            System.out.print(comparable + ", ");
        }
        System.out.println();
    }

}
