public class Main {
    public static void task1() {
    }

    public static void task2() {
    }

    public static void task3() {
    }

    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
            System.out.println("Установите приложение для Айфон");
            return 0;
        } else {
            System.out.println(" Установите приложение для Андроид ");
            return 1;
        }
    }

    public static int currentYear(String name) {
        if (name.equals("2022")) {
            System.out.println("Установите стандартную версию приложения");
            return 0;
        } else {
            System.out.println("Установите приложение lite");
        }
        return 1;
    }
    public static void isLeapYear(int year) {
        if (year % 4 != 0) {
            System.out.println("Год не високосный");
            return;
        } else if (year % 400 == 0) {
            System.out.println("Год високосный");
            return;
        } else if (year % 100 == 0) {
            System.out.println("Год не високосный");
            return;
        } else {
            System.out.println("Год високосный");
            return;
        }
    }
    public static void deliveryDistan (int deliveryDistan) {
        if (deliveryDistan <= 20){
            System.out.println("Доставка занимает сутки");
        return;
            }else if (deliveryDistan > 20 && deliveryDistan <=60 ) {
            System.out.println("Доставка занимает сутки" + 2);
            return;
        }else if (deliveryDistan > 60 && deliveryDistan <=100) {
            System.out.println("Доставка занимает сутки" + 3);
            return;
        }
    }


    public static void main(String[] args) {
        task1();
        int year= 2022;
        isLeapYear(year);
        System.out.println();

        task2();
        String osName = "iOS";
        int clientOS = getClientOS(osName);
        System.out.println(clientOS);
        String yearName = "2022";
        int currentYear =currentYear (yearName) ;
        System.out.println();

        task3();
         int deliveryDistan = 95;
         deliveryDistan(deliveryDistan);
        System.out.println();

        // готово)









    }

}