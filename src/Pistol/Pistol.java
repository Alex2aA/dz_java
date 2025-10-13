package Pistol;

public class Pistol {
    private int bullets;
    private final int maxCapacity;

    public Pistol(int maxCapacity) {
        if (maxCapacity <= 0) {
            throw new IllegalArgumentException("Максимальная вместимость должна быть положительной");
        }
        this.maxCapacity = maxCapacity;
        this.bullets = 0;
    }

    public Pistol(int maxCapacity, int initialBullets) {
        this(maxCapacity);
        if (initialBullets < 0) {
            throw new IllegalArgumentException("Количество патронов не может быть отрицательным");
        }
        this.bullets = Math.min(initialBullets, maxCapacity);
    }

    public void shoot() {
        if (bullets > 0) {
            System.out.print("Бах! ");
            bullets--;
        } else {
            System.out.print("Клац! ");
        }
    }

    public int reload(int bulletsToAdd) {
        if (bulletsToAdd < 0) {
            throw new IllegalArgumentException("Отрицательного числа патронов быть не может");
        }

        int oldBullets = bullets;
        bullets = Math.min(bullets + bulletsToAdd, maxCapacity);
        int actuallyAdded = bullets - oldBullets;
        int remaining = bulletsToAdd - actuallyAdded;

        return remaining;
    }

    public int unload() {
        int removedBullets = bullets;
        bullets = 0;
        return removedBullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    public int getCurrentBullets() {
        return bullets;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public boolean isLoaded() {
        return bullets > 0;
    }

    public boolean isEmpty() {
        return bullets == 0;
    }
}
