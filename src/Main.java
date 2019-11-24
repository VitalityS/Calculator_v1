/**
 * Калькулятор с арифметическими вычислениями
 * @author Vitaliy Shishkalov
 * @date 24.11.2019
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
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
    }
}
