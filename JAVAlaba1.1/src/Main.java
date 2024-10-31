import com.hotdogs.*;

public class Main {
    public static void main(String[] args) {
        // ������� �����������
        HotDogRepository repository = new HotDogRepository();

        // ������� ������� ���������� ����� ���-�����
        HotDog hunterDog = new HunterDog();
        HotDog masterDog = new MasterDog();
        HotDog berlina = new Berlina();

        // ��������� ���-���� � �����������
        repository.addHotDog(hunterDog, 5);
        repository.addHotDog(masterDog, 3);
        repository.addHotDog(berlina, 2);

        // ������� ��������� ���� ���-�����
        System.out.println("��������� ���� ���-�����:");
        for (String hotDog : repository.getAvailableHotDogs()) {
            System.out.println(hotDog);
        }

        // ������������ ����� ����������, ��������� � ������� ���������
        System.out.println("����� ���������� ���������� ���-�����: " + repository.countTotalHotDogs());
        System.out.println("����� ��������� ������: $" + repository.calculateTotalCost());
        System.out.println("������� ��������� ������ ���-����: $" + repository.calculateAverageCost());
    }
}
