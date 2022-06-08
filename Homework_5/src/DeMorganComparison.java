import java.util.Scanner;
public class DeMorganComparison {
    public static void main(String[] args) {

        //Задание 6
        //Используя IntelliJ IDEA, создайте класс DeMorganComparison. Используя теорему Де Моргана, преобразуйте
        // исходное выражение A | B, в эквивалентное выражение.


//        Исходное выражение		Эквивалентное выражение
//               A | B		=		!(!A & !B)
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a | b;
        int d = ~(~a & ~b);
        System.out.println(c);
        System.out.println(d);






    }
}
