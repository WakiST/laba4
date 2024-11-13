package com.hotdogs;

import java.util.ArrayList;
import java.util.List;

// �����-����������� ��� ���������� ���������� �������� HotDog
public class HotDogRepository {
    private List<HotDog> hotDogList; // ��������� ���-�����

    // ����������� �������������� ������ ���������
    public HotDogRepository() {
        this.hotDogList = new ArrayList<>();
    }

    // ����� ���������� ���-���� � ���������
    public void addHotDog(HotDog hotDog) {
        hotDogList.add(hotDog);
    }

    // ����� �������� ���-���� �� ������� �� ���������
    public void removeHotDog(int index) {
        if (index >= 0 && index < hotDogList.size()) {
            hotDogList.remove(index);
        }
    }

    // ����� ���������� ���-���� �� �������
    public void updateHotDog(int index, HotDog newHotDog) {
        if (index >= 0 && index < hotDogList.size()) {
            hotDogList.set(index, newHotDog);
        }
    }

    // ����� ��� ��������� ������ ���� ���-�����
    public List<HotDog> getHotDogList() {
        return hotDogList;
    }
}
