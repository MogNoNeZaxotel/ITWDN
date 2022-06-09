import java.util.Scanner;
public class Methods {
        static void cikly(int ryad, int stolb) {
            for (int i = 0; i < ryad; i++){
                for (int j = 0; j < stolb; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        static String compare(int a, int b) {
            if (a > b)
                return "A > B";
            else if (a < b)
                return "A < B";
            else
                return "A = B";
        }



        static void sravnenie(int a, int b){
            if (a > b) {
                System.out.println("a > b");
            }
        }

        static double srednee (double a, double b) {
            double c = (a + b) / 2;
            return b;
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            String method = compare(a, b);
            System.out.println(method);
//        cikly(3, 8);
//        cikly(8, 3);
//        sravnenie(8, 7);
//        System.out.println(srednee(4, 8));
//        String method = compare(4, 4);
//        System.out.println(method);




//            static String uslovie (int a, int b) {
//
//                if (a > b)
//                    return "peremennaya a > b";
//
//                else if (a < b)
//                    return "peremennaya a < b";
//                else
//                    return "peremennaya a = b";
//            }
//            static double sredneearifm(double a, double b, double c) {
//                double sred = (a + b + c) / 3;
//                return sred;
//            }
//            static void sms() {
//                System.out.println("vvedite dannie");
//            }
//            public static void main(String[] args) {
//                test in = new test();
//                Scanner sc = new Scanner(System.in);
//                sms();
//                double a = sc.nextDouble();
//                double b = sc.nextDouble();
//                double c = sc.nextDouble();
//                System.out.println(sredneearifm(a, b, c));
//                sms();
//                int x = sc.nextInt();
//                int y = sc.nextInt();
//                System.out.println(uslovie(x, y));
//                in.cikly(4, 4);
//            }
        }
    }


