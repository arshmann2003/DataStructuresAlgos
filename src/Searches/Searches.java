package Searches;

public class Searches {
    public static boolean LinearSearch(int[] arr, int target){
        for (int j : arr) {
            if (j == target)
                return true;
        }
        return false;
    }
    public static boolean BinarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while(low <= high){
            mid = (low + high) / 2;
            if(target < arr[mid] )
                high = mid - 1;
            else if(target > arr[mid])
                low = mid+1;
            else
                return true;
        }
        return false;
    }
    public static boolean RecursiveBinarySearch(int[] arr, int target, int low, int high){
        if(low > high)
            return false;
        int mid = (low + high) / 2;
        int subLow = low;
        int subHigh = high;
        if(arr[mid] == target)
            return true;
        else if(target < arr[mid])
            subHigh = mid - 1;
        else if(target > arr[mid])
            subLow = mid + 1;

        return RecursiveBinarySearch(arr, target, subLow, subHigh);
    }
}
