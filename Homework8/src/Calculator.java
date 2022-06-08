import java.util.Scanner;
public class Calculator {
    //Задание 4
    //Используя IntelliJ IDEA, создайте класс Calculator. Создайте метод с именем calculate, который принимает в
    // качестве параметров три целочисленных значения и возвращает значение каждого аргумента, деленного на 5.

    static void calculate(double a, double b, double c) {
        System.out.println(a / 5);
        System.out.println(b / 5);
        System.out.println(c / 5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        calculate(a, b, c);

    }
}
