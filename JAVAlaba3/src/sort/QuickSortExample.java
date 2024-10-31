package sort;

public class QuickSortExample {

    // ����� ������� ���������� �������
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // ���������� ������ �������� �������� ����� ���������
            int pivotIndex = partition(arr, low, high);

            // ���������� ��������� ����� � ������ ����� �������
            quickSort(arr, low, pivotIndex - 1);  // ����� ���������
            quickSort(arr, pivotIndex + 1, high); // ������ ���������
        }
    }

    // ����� ��� ��������� ������� � ����������� ������� �������� ��������
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // ������� ������� (��������� ������� �������)
        int smallerElementIndex = low - 1; // ������ ��� ��������� ������ ��������

        for (int j = low; j < high; j++) {
            // ���� ������� ������� ������ ��� ����� ��������
            if (arr[j] <= pivot) {
                smallerElementIndex++;

                // ������ ������� ������� ������� � ������� �� ������� smallerElementIndex
                int temp = arr[smallerElementIndex];
                arr[smallerElementIndex] = arr[j];
                arr[j] = temp;
            }
        }

        // ���������� ������� ������� �� ���������� ������� � ��������������� �������
        int temp = arr[smallerElementIndex + 1];
        arr[smallerElementIndex + 1] = arr[high];
        arr[high] = temp;

        return smallerElementIndex + 1; // ���������� ������ �������� ��������
    }
}
