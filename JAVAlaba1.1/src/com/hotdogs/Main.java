package com.hotdogs;

public class Main {
    public static void main(String[] args) {
        // ������� ����������� ���-�����
        HotDogRepository repository = new HotDogRepository();

        // ������� ���-����
        HotDog hunterDog = new HotDog("HunterDog", 2.5);
        HotDog masterDog = new HotDog("MasterDog", 3.0);
        HotDog berlina = new HotDog("Berlina", 2.8);

        // ��������� ���-���� � �����������
        repository.addHotDog(hunterDog);
        repository.addHotDog(masterDog);
        repository.addHotDog(berlina);

        // ������� �����
        Order order = new Order();

        // ��������� ���-���� � ����� (����������)
        order.addHotDog(hunterDog, 5);
        order.addHotDog(masterDog, 4);
        order.addHotDog(berlina, 3);

        // ������� ���������� � ������
        System.out.println("����� �����: " + order.calculateTotal());
        System.out.println("���������� �������: " + order.countOrders());
        System.out.println("������� ���������: " + order.calculateAverage());

        // ��������� ���-��� � �����������
        HotDog newDog = new HotDog("SpicyDog", 3.5);
        repository.updateHotDog(1, newDog);

        // ������� ���-��� �� �����������
        repository.removeHotDog(0);

        // ������ ������ ���� ���-����� � �����������
        System.out.println("���-���� � �����������:");
        for (HotDog hotDog : repository.getHotDogList()) {
            System.out.println(hotDog.getName() + ": $" + hotDog.getPrice());
        }
    }
}
