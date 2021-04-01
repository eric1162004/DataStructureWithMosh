import AVLTree.AVLTreeTest;
import BinaryTree.BinaryTreeTest;
import Graph.GraphTest;
import HashTable.HashTableDemo;
import Heap.HeapTest;
import Heap.MaxHeap;
import Sorting.BubbleSort;
import Sorting.InsertSort;
import Sorting.MergeSort;
import Sorting.SelectionSort;
import Trie.TrieTest;
import WeightedGraph.WeightedGraphTest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {7,3,1,4,6,2,3};
        MergeSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
