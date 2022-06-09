import java.util.Scanner;
public class For_While_do_While {
        public static void main(String[] args) {
            //Даны целые числа N i K (N > 0). Вывести N раз число K.
            Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        for ( ; n > 0 ; n--) {
//            System.out.println(k);
//        }




            //Даны два целых числа A и B (A < B). Вывести в порядке возрастания все целые числа,
            // расположенные между A и B (включая сами числа A и B), а также количество N этих чисел.

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = 0;
//        for (int i = a; a <= b; i++) {
//            System.out.println(a);
//            a++;
//            c++;
//        }
//        System.out.println(c);


            // Даны два целых числа A и B (A < B). Вывести в порядке убывания все целые числа,
            // расположенные между A и B (не включая числа A и B), а также количество N этих чисел

//        int b = sc.nextInt();
//        int a = sc.nextInt();
//        int c = 0;
//        for (int i = b - 1; i > a; i--) {
//            b--;
//            System.out.println(b);
//            c++;
//        }
//       System.out.println(c);



            //Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1, 2, ... , 10 кг конфет.

//        System.out.println("Введите число - цену 1 кг конфет");
//        int a = sc.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i * a);
//        }




            //Дано вещественное число — цена 1 кг конфет. Вывести стоимость 0.1, 0.2, ... , 1 кг конфет
//        double a = sc.nextDouble();
//        for (double i = 0.1; i < 1; i+= 0.1) {
//            System.out.println(i * a);
//        }




            //Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1.2, 1.4, ... , 2 кг конфет.
//        double a = sc.nextDouble();
//        for (double i = 1.2; i <= 2; i+= 0.2) {
//            System.out.println(a * i);
//        }

            //. Даны два целых числа A и B (A < B). Найти сумму всех целых чисел от A до B включительно
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = 0;
//        for (int i = a; a <= b; i++) {
//            System.out.println(a);
//            c += a;
//            a++;
//        }
//        System.out.println(c);


            //Даны два целых числа A и B (A < B). Найти произведение всех целых чисел от A до B включительно
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = 1;
//        for (int i = a; a <= b; i++) {
//            System.out.println(a);
//            c = c * a; // c *= a;
//            a++;
//        }
//        System.out.println(c);

            //Даны два целых числа A и B (A < B). Найти сумму квадратов всех целых чисел от A до B включительно
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        double c = 1;
//        for (int i = a; a <= b; i++) {
//            System.out.println(a);
//            c = c * (Math.pow(a, 2));
//            a++;
//        }
//        System.out.println(c);

            //Дано целое число N (> 0). Найти сумму 1 + 1/2 + 1/3 + ... + 1/N (вещественное число).
            int n = sc.nextInt();
            double c = 0;
//        for (int i = 1; 1 <= n; i++) {
//            c = (1 / n);
//            System.out.println(n);
//            n--;
//        }
            for (int i = 1; i <= n; i++) {
                c += 1 / (double) i;
            }
            System.out.println(c);
        }
}
