import java.util.Arrays;


public class Sortinglgorithms {


    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;


        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {


                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    // Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;


        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;


            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }


            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }


    // Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;


        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;


            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }


            arr[j + 1] = key;
        }
    }


    public static void main(String[] args) {


        int[] originalArray = {
            42, 9, 6, 87, 6,
            95,8, 87, 3, 56,
        };


        int[] bubbleArray =
            Arrays.copyOf(originalArray, originalArray.length);


        int[] selectionArray =
            Arrays.copyOf(originalArray, originalArray.length);


        int[] insertionArray =
            Arrays.copyOf(originalArray, originalArray.length);


        System.out.println("Original Array: "
                + Arrays.toString(originalArray));


        bubbleSort(bubbleArray);
        System.out.println("Bubble Sort: "
                + Arrays.toString(bubbleArray));


        selectionSort(selectionArray);
        System.out.println("Selection Sort: "
                + Arrays.toString(selectionArray));


        insertionSort(insertionArray);
        System.out.println("Insertion Sort: "
                + Arrays.toString(insertionArray));
    }
}
