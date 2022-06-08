import java.util.Scanner;
public class SumMin {
    public static void main(String[] args) {

        //Задание 2
        //Используя IntelliJ IDEA, создайте класс SumMin. Дано два числа A и B (A<B) выведите суму всех чисел,
        // расположенных между данными числами на экран. Дано два числа A и B (A<B) выведите все нечетные значения,
        // расположенные между данными числами.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        for (int i = a + 1; i < b; i++) {
            c += i;
        }
        System.out.println(c);


//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        for (int i = a + 1; i < b; i++) {
//            if (i % 2 != 0)
//                System.out.println(i);
//        }

    }
}

