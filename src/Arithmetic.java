public class Arithmetic {
/**@see #operation выводит в консоль результат арифметической операции,
 * с округлением до 4 цифр после запятой.
 *В качестве параметров передаются введеные в консоль дробные числа
 */
    public void operation(double a, double b, String oper) {
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
