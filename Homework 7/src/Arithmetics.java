import java.util.Scanner;
public class Arithmetics {
    //Задание 2
    //Используя IntelliJ IDEA, создайте класс Arithmetics. Создайте четыре метода для выполнения арифметических
    // операций, с именами: add – сложение, sub – вычитание, mul – умножение, div – деление. Каждый метод должен
    // принимать два целочисленных аргумента и выводить на экран результат выполнения арифметической операции
    // соответствующей имени метода. Метод деления div, должен выполнять проверку попытки деления на ноль. Требуется
    // предоставить пользователю возможность вводить с клавиатуры значения операндов и знак арифметической операции,
    // для выполнения вычислений.

    static double add(double a, double b) {
        return a + b;
    }

    static double sub(double a, double b) {
        return a - b;
    }

    static double mul(double a , double b) {
        return a * b;
    }

    static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Деление на ноль - невозможно!");
            return 0;
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double opperand1 = sc.nextInt();
        String c = sc.next();
        double opperand2 = sc.nextInt();
            if (c.equals("+")) {
                System.out.println(add(opperand1, opperand2));
            } else if (c.equals("-")) {
                System.out.println(sub(opperand1, opperand2));
            } else if (c.equals("*")) {
                System.out.println(mul(opperand1, opperand2));
            } else if (c.equals("/")) {
                System.out.println(div(opperand1, opperand2));
            }
    }
}
