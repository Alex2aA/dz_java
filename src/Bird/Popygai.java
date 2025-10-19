package Bird;

public class Popygai extends Bird {
    private String text;
    public Popygai(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    @Override
    void sing() {
        int n = (int)(Math.random() * text.length()) + 1;
        System.out.println(text.substring(0, n));
    }
}
