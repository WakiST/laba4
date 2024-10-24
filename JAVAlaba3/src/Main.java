import java.util.Arrays;
import static sort.QuickSortExample.quickSort;

public class Main {

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Исходный массив: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }
}
