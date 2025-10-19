package Pistol;

public class Rifle extends Weapon{
    private int gunRate;
    private int bullets;

    public Rifle(){
        super(30);
        this.gunRate = 30;
    }
    public Rifle(int maxAmmo){
        super(maxAmmo);
        this.gunRate = maxAmmo / 2;
    }
    public Rifle (int maxAmmo, int gunRate){
        super(maxAmmo);
        this.gunRate = gunRate;
    }

    public void shoot(){
        for (int i = 0; i < gunRate; i++){
            if (bullets > 0) {
                System.out.print("Бах! ");
                bullets--;
            } else {
                System.out.print("Клац! ");
            }
        }
    }

    public void shoot(int time){
        for (int i = 0; i < gunRate * time; i++){
            if (bullets > 0) {
                System.out.print("Бах! ");
                bullets--;
            } else {
                System.out.print("Клац! ");
            }
        }
    }

    public int reload(int ammo){
        if (ammo <= 0) throw new RuntimeException();
        int tmp = ammo;
        this.bullets = ammo;
        return tmp;
    }

}
