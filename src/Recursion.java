import java.util.Scanner;
public class Recursion {
    //Описать рекурсивную функцию Fact(N) вещественного типа, вычисляющую значение факториала
    //N! = 1·2·...·N
    //(N > 0 — параметр целого типа). С помощью этой функции вычислить факториалы пяти данных чисел.
//    static int fact (int n) {
//
//        if (n == 0) {
//            return 1;
//        } else {
//            return n * fact(n - 1);
//        }
//    }
//
//    public static void main(String[] args) {
//        int fact = fact(3);
//        System.out.println(fact);
//
//    }




    //Описать рекурсивную функцию Fact2(N) вещественного типа, вычисляющую значение двойного факториала
    //N!! = N·(N−2)·(N−4)·...
    //(N > 0 — параметр целого типа; последний сомножитель в произведении равен 2, если N — четное число, и 1,
    // если N — нечетное). С помощью этой функции вычислить двойные факториалы пяти данных чисел.

    static double fact2 (double n) {
        if (n > 0 && n % 2 == 0) {
            return n * fact2(n - 2);
        }
        else if (n > 0 && n % 2 > 0) {
            return n * fact2(n - 2);
        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        double fact2 = fact2(8);
        System.out.println(fact2);
    }
}
