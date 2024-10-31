import java.util.Arrays;
import sort.QuickSortExample;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Исходный массив: " + Arrays.toString(arr));

        // Выполняем быструю сортировку
        QuickSortExample.quickSort(arr, 0, arr.length - 1);

        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }
}
