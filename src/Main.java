public class Main {

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

    public static void deliveryDistance(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Доставка занимает сутки");
            return;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка занимает сутки" + 2);
            return;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка занимает сутки" + 3);
            return;
        }
    }

    public static void main(String[] args) {
        // Задание 1
        int year = 2022;
        isLeapYear(year);
        System.out.println();

        // Задание 2
        String osName = "iOS";
        int clientOS = getClientOS(osName);

        String yearName = "2022";
        int currentYear = currentYear(yearName);
        System.out.println();

        // Задание 3
        int deliveryDistance = 95;
        deliveryDistance(deliveryDistance);
        System.out.println();


    }

}