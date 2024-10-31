import com.hotdogs.*;

public class Main {
    public static void main(String[] args) {
        // Создаем репозиторий
        HotDogRepository repository = new HotDogRepository();

        // Создаем объекты конкретных типов хот-догов
        HotDog hunterDog = new HunterDog();
        HotDog masterDog = new MasterDog();
        HotDog berlina = new Berlina();

        // Добавляем хот-доги в репозиторий
        repository.addHotDog(hunterDog, 5);
        repository.addHotDog(masterDog, 3);
        repository.addHotDog(berlina, 2);

        // Выводим доступные виды хот-догов
        System.out.println("Доступные виды хот-догов:");
        for (String hotDog : repository.getAvailableHotDogs()) {
            System.out.println(hotDog);
        }

        // Подсчитываем общее количество, стоимость и среднюю стоимость
        System.out.println("Общее количество заказанных хот-догов: " + repository.countTotalHotDogs());
        System.out.println("Общая стоимость заказа: $" + repository.calculateTotalCost());
        System.out.println("Средняя стоимость одного хот-дога: $" + repository.calculateAverageCost());
    }
}
