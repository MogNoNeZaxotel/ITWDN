import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Задание 6
        //Используя IntelliJ IDEA, создайте проект c классом main. Создайте две целочисленные переменные и
        // выведите на экран результаты всех арифметических операций над этими двумя переменными.

        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        System.out.println(sum);
        int dif = a - b;
        System.out.println(dif);
        int mult = a * b;
        System.out.println(mult);
        double div = a / b;
        System.out.println(div);
        double div2 = b / a;
        System.out.println(div2);
        int per = a % b;
        System.out.println(per);
        int per2 = b % a;
        System.out.println(per2);
        double deg = Math.pow(a, b);
        System.out.println(deg);
        double deg2 = Math.pow(b, a);
        System.out.println(deg2);


    }
}
