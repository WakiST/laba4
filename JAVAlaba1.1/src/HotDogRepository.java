package com.hotdogs;

import java.util.ArrayList;
import java.util.List;

// Класс-репозиторий для управления коллекцией объектов HotDog
public class HotDogRepository {
    private List<HotDog> hotDogList; // Коллекция хот-догов

    // Конструктор инициализирует пустую коллекцию
    public HotDogRepository() {
        this.hotDogList = new ArrayList<>();
    }

    // Метод добавления хот-дога в коллекцию
    public void addHotDog(HotDog hotDog) {
        hotDogList.add(hotDog);
    }

    // Метод удаления хот-дога по индексу из коллекции
    public void removeHotDog(int index) {
        if (index >= 0 && index < hotDogList.size()) {
            hotDogList.remove(index);
        }
    }

    // Метод обновления хот-дога по индексу
    public void updateHotDog(int index, HotDog newHotDog) {
        if (index >= 0 && index < hotDogList.size()) {
            hotDogList.set(index, newHotDog);
        }
    }

    // Метод для получения списка всех хот-догов
    public List<HotDog> getHotDogList() {
        return hotDogList;
    }
}
