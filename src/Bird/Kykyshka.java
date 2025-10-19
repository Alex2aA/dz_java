package Bird;

public class Kykyshka extends Bird {
    @Override
    void sing() {
        int n = (int)(Math.random() * 10) + 1;
        for(int i = 0; i < n; i++) {
            System.out.println("ку-ку");
        }
    }
}
