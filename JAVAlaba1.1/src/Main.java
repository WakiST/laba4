import com.hotdogs.HotDog;
import com.hotdogs.Order;

public class Main {
    public static void main(String[] args) {
        // Создаем хот-доги с названием и ценой
        HotDog hunterDog = new HotDog("HunterDog", 2.5);
        HotDog masterDog = new HotDog("MasterDog", 3.0);
        HotDog berlina = new HotDog("Berlina", 2.8);

        // Создаем заказ
        Order order = new Order();

        // Добавляем хот-доги в заказ
        order.addHotDog(hunterDog, 5);
        order.addHotDog(masterDog, 4);
        order.addHotDog(berlina,3);

        // Выводим сумму заказа
        System.out.println("Общая сумма: " + order.calculateTotal());

        // Выводим количество заказанных хот-догов
        System.out.println("Количество заказов: " + order.countOrders());

        // Выводим среднюю стоимость заказа
        System.out.println("Средняя стоимость: " + order.calculateAverage());
    }
}
