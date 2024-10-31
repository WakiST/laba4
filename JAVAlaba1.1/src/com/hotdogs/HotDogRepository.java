package com.hotdogs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HotDogRepository {
    private final List<HotDog> hotDogList; // ��������� ���� ���������� ���-�����
    // ����������� ������
    public HotDogRepository() {
        hotDogList = new ArrayList<>();
    }

    // ����� ��� ���������� ���-���� � ���������
    public void addHotDog(HotDog hotDog, int quantity) {
        for (int i = 0; i < quantity; i++) {
            hotDogList.add(hotDog);
        }
    }

    // ����� ��� �������� ������ ���������� ���-�����
    public int countTotalHotDogs() {
        return hotDogList.size();
    }

    // ����� ��� �������� ����� ��������� ���-�����
    public double calculateTotalCost() {
        double total = 0;
        for (HotDog hotDog : hotDogList) {
            total += hotDog.getPrice();
        }
        return total;
    }

    // ����� ��� �������� ������� ��������� ���-�����
    public double calculateAverageCost() {
        int totalHotDogs = countTotalHotDogs();
        if (totalHotDogs == 0) return 0; // �������� ������� �� ����
        return calculateTotalCost() / totalHotDogs;
    }

    // ����� ��� ������ ���� ���-�����
    public Set<String> getAvailableHotDogs() {
        Set<String> uniqueHotDogs = new HashSet<>();
        for (HotDog hotDog : hotDogList) {
            uniqueHotDogs.add(hotDog.getName() + ": $" + hotDog.getPrice());
        }
        return uniqueHotDogs;
    }
}
