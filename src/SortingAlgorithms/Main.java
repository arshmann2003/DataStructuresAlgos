package SortingAlgorithms;

public class Main {
    public static void main(String[] args){
        int[] arr = {5,4,2,15,2,234,43,2,1};
//        MergeSort.mergeSort(arr);
        SelectionSort.selectionSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
