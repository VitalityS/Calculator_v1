/**
 * Калькулятор с арифметическими вычислениями
 * @author Vitaliy Shishkalov
 * @date 24.11.2019
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("При вводе 1 - запустится калькулятор\nПри вводе 2 - запустится поиск максимального слова в массиве");
        int num = in.nextInt();
        if(num == 1) {
            Arithmetic arithmetic = new Arithmetic();
            arithmetic.inputDataForTheCalculation();
            arithmetic.calculation();
        }if (num == 2){
            ArrayOfWords arrayOfWords = new ArrayOfWords();

            arrayOfWords.searchMaxSizeWordInArrayWords();

        }
    }
}
