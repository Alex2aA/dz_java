package Pistol;

public class Rifle extends Pistol{
    private int gunRate;

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
            super.shoot();
        }
    }

    public void shoot(int time){
        for (int i = 0; i < gunRate * time; i++){
            super.shoot();
        }
    }

}
