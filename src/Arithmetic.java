import java.util.Scanner;
public class Arithmetic {
   private double a;
   private String oper;
   private double b;
/**@see #calculation выводит в консоль результат арифметической операции,
 * с округлением до 4 цифр после запятой.
 *В качестве параметров передаются введеные в консоль дробные числа
 */

public void inputDataForTheCalculation(){
    Scanner in = new Scanner(System.in);
    System.out.println("Введите первое число для вычисления:");
    a = in.nextDouble();
    System.out.println("Введите арифметическую операцию: '+' '-' '*' '/'");
    oper = in.next();
    System.out.println("Введите второе число для вычисления:");
    b = in.nextDouble();
    //закрываем поток ввода
    in.close();
}

    public void calculation() {
        double result;
        switch (oper) {
            case "+":
                result = a + b;
                System.out.printf("Сумма чисел: %.4f", result);
                break;
            case "-":
                result = a - b;
                System.out.printf("Разность чисел: %.4f", result);
                break;
            case "*":
                result = a * b;
                System.out.printf("Произведение чисел: %.4f", result);
                break;
            case "/":
                result = a / b;
                System.out.printf("Частное чисел: %.4f", result);
                break;
        }
    }
}
