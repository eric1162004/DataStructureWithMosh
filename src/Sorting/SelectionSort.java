package Sorting;

public class SelectionSort {
    public static void sort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = getMinIndex(array, i);
            swap(array, i, minIndex);
        }
    }

    private static int getMinIndex(int[] array, int startIndex) {
        var minIndex = startIndex;
        for (int j = startIndex; j < array.length; j++) {
            if(array[minIndex] > array[j])
                minIndex = j;
        }
        return minIndex;
    }

    public static void swap (int[] array, int index1, int index2){
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
