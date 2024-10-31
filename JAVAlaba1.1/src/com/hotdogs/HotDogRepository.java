package com.hotdogs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HotDogRepository {
    private final List<HotDog> hotDogList; // Коллекция всех заказанных хот-догов
    // Конструктор класса
    public HotDogRepository() {
        hotDogList = new ArrayList<>();
    }

    // Метод для добавления хот-дога в коллекцию
    public void addHotDog(HotDog hotDog, int quantity) {
        for (int i = 0; i < quantity; i++) {
            hotDogList.add(hotDog);
        }
    }

    // Метод для подсчета общего количества хот-догов
    public int countTotalHotDogs() {
        return hotDogList.size();
    }

    // Метод для подсчета общей стоимости хот-догов
    public double calculateTotalCost() {
        double total = 0;
        for (HotDog hotDog : hotDogList) {
            total += hotDog.getPrice();
        }
        return total;
    }

    // Метод для подсчета средней стоимости хот-догов
    public double calculateAverageCost() {
        int totalHotDogs = countTotalHotDogs();
        if (totalHotDogs == 0) return 0; // Избегаем деления на ноль
        return calculateTotalCost() / totalHotDogs;
    }

    // Метод для вывода всех хот-догов
    public Set<String> getAvailableHotDogs() {
        Set<String> uniqueHotDogs = new HashSet<>();
        for (HotDog hotDog : hotDogList) {
            uniqueHotDogs.add(hotDog.getName() + ": $" + hotDog.getPrice());
        }
        return uniqueHotDogs;
    }
}
