public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");

        byte clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");}
        else {
            System.out.println("Установите версию приложения для Android по ссылке");}

        System.out.println("Задание №2");

        short clientDeviceYear = 2016;
        clientOS = 1;

        if ( clientDeviceYear < 2015){
            if (clientOS == 0){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке ");}
            else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");}
        }
        else{
            if (clientOS == 0){
                System.out.println("Установите версию приложения для iOS по ссылке");}
            else {
                System.out.println("Установите версию приложения для Android по ссылке");}
        }

        System.out.println("Задание №3");

        short year = 2000;

        if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && year > 1584){
            System.out.println(year + " год является високосным");}
        else {
            System.out.println(year + "год не является високосным");
        }

        System.out.println("Задание №4");

        int deliveryDistance = 95;
        byte deliveryDay = 0;

        if (deliveryDistance < 20){
            deliveryDay = 1;}
        else if(deliveryDistance >= 20 && deliveryDistance < 60){
            deliveryDay = 2;}
        else if(deliveryDistance >= 60 && deliveryDistance < 100){
            deliveryDay = 3;}

        if (deliveryDay != 0){
            System.out.println("Потребуется дней: " + deliveryDay);}
        else {
            System.out.println("Доставки нет");}

        System.out.println("Задание №5");

        byte monthNumber = 12;

        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
        }

    }
}