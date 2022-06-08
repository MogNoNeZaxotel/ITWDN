import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Задание 3
        // Используя IntelliJ IDEA, создайте класс Circle. Создайте константу с именем PI (число π «пи»),
        // создайте переменную радиус с именем – r.
        // Используя формулу πR2 , вычислите площадь круга и выведите результат на экран.

        final double PI = 3.14;
        int r = input.nextInt();
        double S = PI * Math.pow(r ,2);
        System.out.println("Площадь круга равна " + S);

    }
}
