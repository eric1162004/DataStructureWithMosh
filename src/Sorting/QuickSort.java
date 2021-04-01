package Sorting;

public class QuickSort {

    public void sort(int[] array){
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int start, int end){
        // Base: return if array has 1 item
        if(start >= end)
            return;
        // Partition
        var boundary = partition(array, start, end);

        // Sort left
        sort(array, start, boundary - 1);

        // Sort right
        sort(array, boundary, end);
    }

    private int partition(int[] array, int start, int end){
        var pivot = array[end];
        var boundary = start - 1;

        for (int i = start; i <= end; i++) {
            if(array[i] <= pivot)
                swap(array, i, ++boundary);
        }

        return boundary;
    }

    private void swap(int[] array, int index1, int index2){
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
