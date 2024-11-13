package com.hotdogs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HotDogApp extends JFrame {
    private HotDogRepository repository;
    private DefaultListModel<String> hotDogListModel;
    private JList<String> hotDogList;
    private JTextField nameField;
    private JTextField priceField;

    public HotDogApp() {
        repository = new HotDogRepository();
        hotDogListModel = new DefaultListModel<>();

        setTitle("Hot Dog Manager");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Панель ввода
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        inputPanel.add(new JLabel("Название:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Цена:"));
        priceField = new JTextField();
        inputPanel.add(priceField);

        // Кнопки
        JButton addButton = new JButton("Добавить ХотДог");
        JButton updateButton = new JButton("Обновить выбранное");
        JButton removeButton = new JButton("Удалить выбранное");

        inputPanel.add(addButton);
        inputPanel.add(updateButton);

        // Список хот-догов
        hotDogList = new JList<>(hotDogListModel);
        JScrollPane scrollPane = new JScrollPane(hotDogList);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(removeButton, BorderLayout.SOUTH);

        // Действие добавления хот-дога
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                double price;
                try {
                    price = Double.parseDouble(priceField.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(HotDogApp.this, "Неправильный формат цены!");
                    return;
                }
                HotDog newHotDog = new HotDog(name, price);
                repository.addHotDog(newHotDog);
                updateHotDogList();
                nameField.setText("");
                priceField.setText("");
            }
        });

        // Действие обновления выбранного хот-дога
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = hotDogList.getSelectedIndex();
                if (selectedIndex != -1) {
                    String name = nameField.getText();
                    double price;
                    try {
                        price = Double.parseDouble(priceField.getText());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(HotDogApp.this, "Неправильный формат цены!");
                        return;
                    }
                    HotDog updatedHotDog = new HotDog(name, price);
                    repository.updateHotDog(selectedIndex, updatedHotDog);
                    updateHotDogList();
                    nameField.setText("");
                    priceField.setText("");
                }
            }
        });

        // Действие удаления выбранного хот-дога
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = hotDogList.getSelectedIndex();
                if (selectedIndex != -1) {
                    repository.removeHotDog(selectedIndex);
                    updateHotDogList();
                }
            }
        });

        updateHotDogList();
        setVisible(true);
    }

    // Метод для обновления списка на основе репозитория
    private void updateHotDogList() {
        hotDogListModel.clear();
        for (HotDog hotDog : repository.getHotDogList()) {
            hotDogListModel.addElement(hotDog.getName() + ": $" + hotDog.getPrice());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HotDogApp());
    }
}
