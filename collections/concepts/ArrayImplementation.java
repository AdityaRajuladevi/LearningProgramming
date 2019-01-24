import java.util.Arrays;

/**
 * ArrayImplementation
 */
public class ArrayImplementation {

    public static void main(String[] args) {
        int[] arr = new int[]{10,5,76,34,23,87};
        System.out.println(arr);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
        int[] arrCopy = arr.clone();
        Arrays.sort(arr);
        System.out.println("After Array is sorted ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Valid Search == "+Arrays.binarySearch(arr, 23));
        System.out.println("InValid Search == "+Arrays.binarySearch(arr, 898));
        System.out.println("Verifying Invalid Search "+Arrays.binarySearch(arr, 88));

        // original array
        System.out.println("Original Array");
        System.out.println(Arrays.toString(arrCopy));
        System.out.println(Arrays.binarySearch(arrCopy, 23));
        
        
        
    }
}