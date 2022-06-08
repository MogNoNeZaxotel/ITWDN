import java.util.Scanner;
public class NumbersCheck {
    //Задание 4
    //Используя IntelliJ IDEA, создайте класс NumbersCheck. Напишите метод, который будет определять:
    // 1) является ли введенное число положительным или отрицательным. 2) Является ли оно простым
    // (используйте технику перебора значений). Простое число – это натуральное число, которое делится на 1 и
    // само на себя. Чтобы определить простое число или нет, следует найти все его целые делители. Если делителей
    // больше 2-х, значит оно не простое. 3) Делится ли на 2, 5, 3, 6, 9 без остатка.

    static void num1(int a) {
        if (a > 0) {
            System.out.println("Число положительное");
        } else if (a < 0) {
            System.out.println("Число отрицательное");
        }
    }


    static void num2(double a) {
        boolean prime = true;
        int i = 2;
        double c = 0;
        for ( i = 2; i < Math.sqrt(a); i++) {
           if (c == a % i) {
               prime = false;
           }
        }
        if (prime) {
            System.out.println("число просте");
        }
        else {
            System.out.println("число не просте");
        }
    }



    static void num3(int a) {
        if (a % 2 == 0 && a % 3 == 0 && a % 5 == 0 && a % 6 == 0 && a % 9 == 0) {
            System.out.println("Число делится на 2, 5, 3, 6, 9 без остатка.");
        } else {
            System.out.println("Число HE делится на 2, 5, 3, 6, 9 без остатка.");
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        num1(a);
        num2(a);
//        num3(a);


    }
}
