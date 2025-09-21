package some;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PasteArray pasteArray = new PasteArray();
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        arr = pasteArray.pasteNumberInArray(arr, 2, 6);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}