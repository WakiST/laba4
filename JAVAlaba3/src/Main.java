import java.util.Arrays;
import sort.QuickSortExample;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("�������� ������: " + Arrays.toString(arr));

        // ��������� ������� ����������
        QuickSortExample.quickSort(arr, 0, arr.length - 1);

        System.out.println("��������������� ������: " + Arrays.toString(arr));
    }
}
