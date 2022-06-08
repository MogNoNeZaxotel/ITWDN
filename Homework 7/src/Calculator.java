import java.util.Scanner;
public class Calculator {
    //Используя IntelliJ IDEA, создайте класс Calculator. Создайте метод с именем calculate, который принимает в
    //качестве параметров три целочисленных аргумента и выводит на экран среднее арифметическое значений аргументов.


    static int calculate (int a, int b, int c) {
        return (a + b + c) / 3;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(calculate(a, b, c));










    }
}
