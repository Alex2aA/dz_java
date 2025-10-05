package one.five.one;

public class Main {
    public static void main(String[] args) {

        Pistol pistol = new Pistol(7);
        System.out.println("Создан пистолет с максимальной вместимостью: " + pistol.getMaxCapacity());
        System.out.println("Текущее количество патронов: " + pistol.getCurrentBullets());
        System.out.println("Заряжен: " + pistol.isLoaded());
        System.out.println();

        System.out.println("Заряжаем 3 патрона...");
        int remaining = pistol.reload(3);
        System.out.println("Текущее количество патронов: " + pistol.getCurrentBullets());
        System.out.println("Лишние патроны: " + remaining);
        System.out.println("Заряжен: " + pistol.isLoaded());
        System.out.println();

        System.out.println("Стреляем 5 раз:");
        for (int i = 0; i < 5; i++) {
            pistol.shoot();
        }
        System.out.println();
        System.out.println("Текущее количество патронов: " + pistol.getCurrentBullets());
        System.out.println();


        System.out.println("Пытаемся зарядить 8 патронов...");
        remaining = pistol.reload(8);
        System.out.println("Текущее количество патронов: " + pistol.getCurrentBullets());
        System.out.println("Лишние патроны: " + remaining);
        System.out.println();


        System.out.println("Стреляем 2 раза:");
        for (int i = 0; i < 2; i++) {
            pistol.shoot();
        }
        System.out.println();
        System.out.println("Текущее количество патронов: " + pistol.getCurrentBullets());
        System.out.println();


        System.out.println("Разряжаем пистолет...");
        int unloaded = pistol.unload();
        System.out.println("Изъято патронов: " + unloaded);
        System.out.println("Текущее количество патронов: " + pistol.getCurrentBullets());
        System.out.println("Заряжен: " + pistol.isLoaded());
        System.out.println();

        System.out.println("Контрольный выстрел:");
        pistol.shoot();
        System.out.println();
    }
}