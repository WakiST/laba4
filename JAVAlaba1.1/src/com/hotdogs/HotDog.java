package com.hotdogs;

// Базовый класс HotDog для учета общих свойств хот-догов
public class HotDog {
    private String name; // название хот-дога
    private double price; // цена хот-дога

    // Конструктор для инициализации хот-дога
    public HotDog(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Метод для получения цены хот-дога
    public double getPrice() {
        return price;
    }

    // Метод для получения названия хот-дога
    public String getName() {
        return name;
    }
}

