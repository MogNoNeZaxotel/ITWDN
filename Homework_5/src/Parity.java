import java.util.Scanner;
public class Parity {
    public static void main(String[] args) {

        //Задание 2
        //Известно, что у четных чисел младший бит имеет значение 0 Используя IntelliJ IDEA, создайте класс Parity.
        // Напишите программу, которая будет выполнять проверку чисел на четность.
        // Предложите два варианта решения поставленной задачи.

        Scanner sc = new Scanner(System.in);
//         Вариант 1
        int num = sc.nextInt();
        if ((num & 1) == 0)
            System.out.println("Число четное");
        else
            System.out.println("Число не четное");
        }

        // Вариант 2
//        int num = sc.nextInt();
//        int a = num % 2;
//        switch (a) {
//            case 0 :
//                System.out.println("Число четное");
//                break;
//            default:
//                System.out.println("Число нечетное");
//                break;
//        }

        // Вариант 3
//        System.out.println("Введите число для проверки на четность: ");
//        int num = sc.nextInt();
//        boolean a = true, b = false;
//        int c = num % 2;
//        boolean res = (c == 0) ? a : b;
//        System.out.println(res);

        }


