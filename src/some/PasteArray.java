package some;

public class PasteArray {

    public int[] pasteNumberInArray(int[] arr, int index, int number) {
        int[] newArray = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }

        for (int i = 0; i < index; i++) {
            System.out.println(newArray[i]);
        }

        newArray[index] = number;

        for (int i = index; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }

        return newArray;
    }
}
