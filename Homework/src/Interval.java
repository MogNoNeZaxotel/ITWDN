import java.util.Scanner;
public class Interval {
    public static void main(String[] args) {

        //Задание 3
        //Используя IntelliJ IDEA, создайте класс Interval. Напишите программу определения, попадает ли указанное
        // пользователем число от 0 до 100 в числовой промежуток [0 - 14] [15 - 35] [36 - 50][51 - 100].
        // Если да, то укажите, в какой именно промежуток. Если пользователь указывает число, не входящее ни в один из
        // имеющихся числовых промежутков, то выводится соответствующее сообщение.

//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int a = num % 15;
//        switch (num) {
//            case :
//                System.out.println("числовой промежуток [0 -]");
//                break;
//            case (15 - 35):
//                System.out.println("числовой промежуток [0 - 1]");
//                break;
//            case (36 - 50):
//                System.out.println("числовой промежуток [ - 14]");
//                break;
//            case (51 - 100):
//                System.out.println("числовой промежуток [0  14]");
//                break;
//        }

        Scanner sc = new Scanner(System.in);
        byte num = sc.nextByte();
        if ( num >= 0 && num <= 14 )
            System.out.println("Вы попали в числовой промежуток [0 - 14]");
        else if ( num >= 15 && num <= 35 )
            System.out.println("Вы попали в числовой промежуток [15 - 35]");
        else if ( num >= 36 && num <= 50 )
            System.out.println("Вы попали в числовой промежуток [36 - 50]");
        else if ( num >= 51 && num <= 100)
            System.out.println("Вы попали в числовой промежуток [51 - 100]");
        else
            System.out.println("Вы не попали в числовой промежуток между [0 - 100]");





    }
}
