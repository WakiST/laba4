package sort;

import java.util.Arrays;

public class QuickSortExample {

    // Метод быстрой сортировки
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Находим индекс опорного элемента
            int pivotIndex = partition(arr, low, high);

            // Рекурсивно сортируем левую и правую части массива
            quickSort(arr, low, pivotIndex - 1);  // Левый подмассив
            quickSort(arr, pivotIndex + 1, high); // Правый подмассив
        }
    }

    // Метод для разбиения массива на две части
    private static int partition(int[] arr, int low, int high) {
        // Выбираем последний элемент в качестве опорного (pivot)
        int pivot = arr[high];
        int i = low - 1; // Индекс меньших элементов

        for (int j = low; j < high; j++) {
            // Если текущий элемент меньше или равен опорному
            if (arr[j] <= pivot) {
                i++;
                // Меняем местами arr[i] и arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            System.out.println("Исходный массив11: " + Arrays.toString(arr));
        }

        // Ставим опорный элемент на правильную позицию
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Возвращаем индекс опорного элемента
    }
}
