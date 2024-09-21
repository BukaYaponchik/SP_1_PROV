import java.time.LocalDate;

public class Main {

    public static boolean checkingLeapYear(short year) {
        if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && year > 1584) {
            return true;
        } else {
            return false;
        }
    }

    public static void determiningPhoneVersion(int clientDeviceYear, byte clientOS) {
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int countingNumberDeliveryDays(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание №1");

        short year = 2000;
        if (checkingLeapYear(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + "год — невисокосный год");
        }

        System.out.println("Задание №2");

        int clientDeviceYear = LocalDate.now().getYear();
        byte clientOS = 1;
        determiningPhoneVersion(clientDeviceYear, clientOS);

        System.out.println("Задание №3");

        int deliveryDistance = 95;
        int deliveryDay = countingNumberDeliveryDays(deliveryDistance);

        if (deliveryDay != 0) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Доставки нет");
        }
    }
}