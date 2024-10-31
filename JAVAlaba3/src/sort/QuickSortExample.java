package sort;

public class QuickSortExample {

    // Метод быстрой сортировки массива
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Определяем индекс опорного элемента после разбиения
            int pivotIndex = partition(arr, low, high);

            // Рекурсивно сортируем левую и правую части массива
            quickSort(arr, low, pivotIndex - 1);  // Левый подмассив
            quickSort(arr, pivotIndex + 1, high); // Правый подмассив
        }
    }

    // Метод для разбиения массива и возвращения индекса опорного элемента
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Опорный элемент (последний элемент массива)
        int smallerElementIndex = low - 1; // Индекс для элементов меньше опорного

        for (int j = low; j < high; j++) {
            // Если текущий элемент меньше или равен опорному
            if (arr[j] <= pivot) {
                smallerElementIndex++;

                // Меняем местами текущий элемент и элемент по индексу smallerElementIndex
                int temp = arr[smallerElementIndex];
                arr[smallerElementIndex] = arr[j];
                arr[j] = temp;
            }
        }

        // Перемещаем опорный элемент на правильную позицию в отсортированном массиве
        int temp = arr[smallerElementIndex + 1];
        arr[smallerElementIndex + 1] = arr[high];
        arr[high] = temp;

        return smallerElementIndex + 1; // Возвращаем индекс опорного элемента
    }
}
