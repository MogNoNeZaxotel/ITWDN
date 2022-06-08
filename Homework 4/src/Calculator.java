import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Задание 2
        //Используя IntelliJ IDEA, создайте класс Calculator. Напишите программу – консольный калькулятор.
        // Создайте две переменные с именами operand1 и operand2. Задайте переменным некоторые произвольные значения.
        // Предложите пользователю ввести знак арифметической операции. Примите значение, введенное пользователем и
        // поместите его в строковую переменную sign. Для организации выбора алгоритма вычислительного процесса,
        // используйте переключатель switch. Выведите на экран результат выполнения арифметической операции.
        // В случае использования операции деления, организуйте проверку попытки деления на ноль. И если таковая
        // имеется, то отмените выполнение арифметической операции и уведомите об ошибке пользователя.

        System.out.println("Введите знак арифметической операции: ");
        String sign = input.next();
        System.out.println("Введите два числа: ");
        double operand1 = input.nextDouble();
        double operand2 = input.nextDouble();
        switch (sign) {
            case "+" :
                double sum = operand1 + operand2;
                System.out.println(sum);
                break;
            case "-" :
                double minus = operand1 - operand2;
                System.out.println(minus);
                break;
            case "*" :
                double umnog = operand1 * operand2;
                System.out.println(umnog);
                break;
            case "/" :
                if (operand1 == 0 || operand2 == 0)
                    System.out.println("На ноль делить нельзя");
                else {
                    double del = operand1 / operand2;
                    System.out.println(del);
                }
                break;
            default:
                System.out.println("Проверьте введенные значения!");
                break;
        }
































//        System.out.println("Введите два числа: ");
//        double operand1  = input.nextDouble();
//        double operand2  = input.nextDouble();
//        System.out.println("Введите знак арифметической операции: +, -, *, /");
//        String sign = input.next();
//        if (sign.equals("+"))
//            System.out.println(operand1 + operand2);
//        else if (sign.equals("-"))
//            System.out.println(operand1 - operand2);
//        else if (sign.equals("*"))
//            System.out.println(operand1 * operand2);
//        else if (sign.equals("/") && operand1 == 0 || operand2 == 0)
//            System.out.println("Учи математику - на ноль делить нельзя!");
//        else if (sign.equals("/") && operand1 != 0 && operand2 != 0)
//            System.out.println(operand1 / operand2);



    }
}
