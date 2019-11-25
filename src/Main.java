/**
 * Калькулятор с арифметическими вычислениями
 * @author Vitaliy Shishkalov
 * @date 24.11.2019
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("При вводе 1 - запустится калькулятор\nПри вводе 2 - запуститься поиск максимального слова в массиве");
        int num = in.nextInt();
        if(num == 1) {
            System.out.println("Введите первое число для вычисления:");
            double a = in.nextDouble();
            System.out.println("Введите арифметическую операцию: '+' '-' '*' '/'");
            String oper = in.next();
            System.out.println("Введите второе число для вычисления:");
            double b = in.nextDouble();
            //закрываем поток ввода
            in.close();
            //создаем объект класса Arithmetic
            Arithmetic arithmetic = new Arithmetic();
            //вызываем метод operation для подсчёта введённых в консоль значений
            /**@see Arithmetic#operation(double a, double b, String oper);*/
            arithmetic.operation(a, b, oper);
        }if (num == 2){
            System.out.println("введите число элементов массива");
            int sizeArray = in.nextInt();
            String[] arrayWord = new String[sizeArray];
            String maxWord = "";
            for (int i = 0; i < sizeArray; i++) {
                System.out.println("Введите слово №" + (i+1));
                arrayWord[i] = in.next();
                if(arrayWord[i].length() > maxWord.length()){
                    maxWord = arrayWord[i];
                }
            }
            System.out.println(maxWord);


        }
    }
}
