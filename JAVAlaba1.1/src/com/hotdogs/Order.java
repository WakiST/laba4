package com.hotdogs;

import java.util.ArrayList;
import java.util.List;

// Класс Order для учета заказов
public class Order {
    private List<HotDog> hotDogs; // Список всех хот-догов в заказе

    public Order() {
        hotDogs = new ArrayList<>(); // Инициализация пустого списка
    }

    // Метод для добавления хот-дога в заказ
    public void addHotDog(HotDog hotDog, int n) {
        for (int i = 0; i < n; i++) {
            hotDogs.add(hotDog);
        }

    }

    // Метод для подсчета общей суммы всех заказов
    public double calculateTotal() {
        double total = 0;
        for (HotDog hotDog : hotDogs) {
            total += hotDog.getPrice(); // Суммируем стоимость всех хот-догов
        }
        return total;
    }

    // Метод для подсчета количества заказанных хот-догов
    public int countOrders() {
        return hotDogs.size(); // Количество хот-догов в заказе
    }

    // Метод для подсчета средней стоимости заказа
    public double calculateAverage() {
        if (hotDogs.size() == 0) return 0;
        return calculateTotal() / hotDogs.size(); // Средняя стоимость = общая сумма / количество
    }
}
