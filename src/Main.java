public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");

        int testInt = 2000000000;
        byte testByte = 100;
        short testShort = 32000;
        long testLong = 9000000000000000000L;
        float testFloat = 1.1111111F;
        double testDouble = 2.1111111111111111;
        System.out.println("Значение переменной testInt с типом int равно " + testInt);
        System.out.println("Значение переменной testByte с типом byte равно " + testByte);
        System.out.println("Значение переменной testShort с типом short равно " + testShort);
        System.out.println("Значение переменной testLong с типом long равно " + testLong);
        System.out.println("Значение переменной testFloat с типом float равно " + testFloat);
        System.out.println("Значение переменной testDouble с типом double равно " + testDouble);

        System.out.println("Задание №2");

        float testNumber1 = 27.12F;
        long testNumber2 = 987678965549L;
        float testNumber3 = 2.786F;
        short testNumber4 = 569;
        short testNumber5 = -159;
        short testNumber6 = 27897;
        byte testNumber7 = 67;

        System.out.println("Задание №3");

        byte pupilsPavlovna = 23;
        byte pupilsSergeyevna = 27;
        byte pupilsAndreyevna = 30;
        short sheetsPaper = 480;
        short totalPupils = (short) (pupilsPavlovna + pupilsSergeyevna + pupilsAndreyevna);
        System.out.println("На каждого ученика рассчитано " + sheetsPaper/totalPupils + " листов бумаги");

        System.out.println("Задание №4");

        byte workRateMinute = 16/2;
        int volume20Minute = workRateMinute * 20;
        int volumeDay = workRateMinute * (24 * 60);
        int volume3Day = workRateMinute * (24 * 60) * 3;
        int volume30Day = workRateMinute * (24 * 60) * 30;
        System.out.println("За 20 минут машина произвела " + volume20Minute + " штук бутылок");
        System.out.println("За день машина произвела " + volumeDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + volume3Day + " штук бутылок");
        System.out.println("За месяц машина произвела " + volume30Day + " штук бутылок");

        System.out.println("Задание №5");

        short totalCansPaint = 120;
        short cansPaintWhite = 2;
        short cansPaintBrown = 4;
        short numberClasses = (short) (totalCansPaint / ( cansPaintWhite + cansPaintBrown));
        short totalCansPaintWhite = (short) (numberClasses * cansPaintWhite);
        short totalCansPaintBrown = (short) (numberClasses * cansPaintBrown);
        System.out.println("В школе, где " + numberClasses + " классов, нужно " + totalCansPaintWhite + " банок белой краски и " + totalCansPaintBrown + " банок коричневой краски");

        System.out.println("Задание №6");

        short weightBanana = 80;
        short weightMilk = 105;
        short weightIceCreamSundae = 100;
        short weightEggs = 70;
        short totalWeight = (short) ((weightBanana * 5) + (weightMilk * 2) + (weightIceCreamSundae * 2) + (weightEggs * 4));
        System.out.println("Граммы " + totalWeight);
        System.out.println("Кг " + totalWeight/1000);

        System.out.println("Задание №7");

        short totalSportWeight = 1000 * 7;
        short firstOption = (short) (totalSportWeight / 250);
        short secondOption = (short) (totalSportWeight / 500);
        short thirdOption = (short) (totalSportWeight / ((500 + 250) / 2));
        System.out.println("Кол-во дней при худении на 250гр " + firstOption);
        System.out.println("Кол-во дней при худении на 500гр " + secondOption);
        System.out.println("Среднее кол-во дней при худении " + thirdOption);

        System.out.println("Задание №8");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryChristina = 76230;
        int totalMasha = salaryMasha * 12;
        int totalDenis = salaryDenis * 12;
        int totalChristina = salaryChristina * 12;
        salaryMasha *= 1.1;
        salaryDenis *= 1.1;
        salaryChristina *= 1.1;
        int salaryDifferenceMasha = (salaryMasha * 12) - totalMasha;
        int salaryDifferenceDenis = (salaryDenis * 12) - totalDenis;
        int salaryDifferenceChristina = (salaryChristina * 12) - totalChristina;
        System.out.println("Маша теперь получает " + salaryMasha + " рублей. Годовой доход вырос на " + salaryDifferenceMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryDenis + " рублей. Годовой доход вырос на " + salaryDifferenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryChristina + " рублей. Годовой доход вырос на " + salaryDifferenceChristina + " рублей");

    }
}