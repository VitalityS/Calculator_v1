import java.util.Scanner;

public class ArrayOfWords {
    private int sizeArray;
    private  String maxWord = "";

    private void setSizeArray(int sizeArray) {
        this.sizeArray = sizeArray;
    }

    public void searchMaxSizeWordInArrayWords() {
        Scanner in = new Scanner(System.in);

        System.out.println("введите число элементов массива");
        setSizeArray(in.nextInt());
        String[] arrayWord = new String[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            System.out.println("Введите слово №" + (i + 1));
            arrayWord[i] = in.next();
            if (arrayWord[i].length() > maxWord.length()) {
                maxWord = arrayWord[i];
            }
        }
        System.out.println(maxWord);
    }
}
