import java.util.Scanner;
public class Volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Задание 4
        // Используя IntelliJ IDEA, создайте класс Volume.
        // Напишите программу расчета объема - V и площади поверхности -S цилиндра.
        // Объем V цилиндра радиусом – R и высотой – h, вычисляется по формуле: V = πR2 h Площадь S поверхности
        // цилиндра вычисляется по формуле: S = 2πR2 + 2πR2 = 2πR(R+h) Результаты расчетов выведите на экран.

        final double PI = 3.14;
        int R = input.nextInt();
        int h = input.nextInt();
        double V = PI * Math.pow(R, 2) * h;
        double S = 2 * PI * R * (R + h);
        System.out.println("Объем цилиндра радиусом " + R + " и высотой " + h + " равняется " + V);
        System.out.println("Площадь поверхности цилиндра радиусом" + R + " и высотой " + h + " равняется " + S);






    }
}
