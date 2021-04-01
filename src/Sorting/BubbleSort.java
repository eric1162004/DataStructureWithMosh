package Sorting;

public class BubbleSort {

    public static void sort(int[] array){
        boolean isSorted;

        for (int i = 0; i < array.length - 1; i++) {
            isSorted = true;
            for (int j = 1; j < array.length - i; j++) { // One additional item sorted in each successive loop
                if(array[j] < array[j-1]) {
                    swap(array, j, j - 1);
                    isSorted = false;
                }
                if(isSorted) // all items are sorted
                    return;
            }
        }
    }

    public static void swap (int[] array, int index1, int index2){
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
