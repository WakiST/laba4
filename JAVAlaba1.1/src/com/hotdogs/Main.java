package com.hotdogs;

public class Main {
    public static void main(String[] args) {
        // Создаем репозиторий хот-догов
        HotDogRepository repository = new HotDogRepository();

        // Создаем хот-доги
        HotDog hunterDog = new HotDog("HunterDog", 2.5);
        HotDog masterDog = new HotDog("MasterDog", 3.0);
        HotDog berlina = new HotDog("Berlina", 2.8);

        // Добавляем хот-доги в репозиторий
        repository.addHotDog(hunterDog);
        repository.addHotDog(masterDog);
        repository.addHotDog(berlina);

        // Создаем заказ
        Order order = new Order();

        // Добавляем хот-доги в заказ (количество)
        order.addHotDog(hunterDog, 5);
        order.addHotDog(masterDog, 4);
        order.addHotDog(berlina, 3);

        // Выводим информацию о заказе
        System.out.println("Общая сумма: " + order.calculateTotal());
        System.out.println("Количество заказов: " + order.countOrders());
        System.out.println("Средняя стоимость: " + order.calculateAverage());

        // Обновляем хот-дог в репозитории
        HotDog newDog = new HotDog("SpicyDog", 3.5);
        repository.updateHotDog(1, newDog);

        // Удаляем хот-дог из репозитория
        repository.removeHotDog(0);

        // Печать списка всех хот-догов в репозитории
        System.out.println("Хот-доги в репозитории:");
        for (HotDog hotDog : repository.getHotDogList()) {
            System.out.println(hotDog.getName() + ": $" + hotDog.getPrice());
        }
    }
}
