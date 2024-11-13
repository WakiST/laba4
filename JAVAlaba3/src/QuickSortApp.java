import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.stream.Stream;
import sort.QuickSortExample;

public class QuickSortApp extends JFrame {
    private JTextField inputField;
    private JTextArea resultArea;

    public QuickSortApp() {
        setTitle("Quick Sort Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ������ �����
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 1));

        inputPanel.add(new JLabel("������� ������ (����� �������):"));
        inputField = new JTextField();
        inputPanel.add(inputField);

        JButton sortButton = new JButton("�����������");
        inputPanel.add(sortButton);

        add(inputPanel, BorderLayout.NORTH);

        // ������� ��� ������ �����������
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        add(new JScrollPane(resultArea), BorderLayout.CENTER);

        // �������� ��� ������ ����������
        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = inputField.getText();
                try {
                    int[] arr = parseInput(inputText); // ������ ������� ����� � ������

                    resultArea.setText("�������� ������: " + Arrays.toString(arr) + "\n");

                    QuickSortExample.quickSort(arr, 0, arr.length - 1); // ��������� ������

                    resultArea.append("��������������� ������: " + Arrays.toString(arr));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(QuickSortApp.this, "������: ��������� ������ �����. ������� �����, ����������� �������.");
                }
            }
        });

        setVisible(true);
    }

    // ����� ��� �������������� ������ � ������ ����� �����
    private int[] parseInput(String input) throws NumberFormatException {
        String[] tokens = input.split(",");
        return Stream.of(tokens)
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuickSortApp());
    }
}
