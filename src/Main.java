public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int total_1 = 0;
        int salary = 15000;
        short mounts = 0;
        while (total_1 <= 2_459_000) {
            total_1 += (int) (total_1 * 0.01);
            total_1 += salary;
            System.out.println("Месяц " + mounts + " сумма накоплений равна " + total_1 + " рублей");
            mounts++;
        }

        System.out.println("Задание №2");
        int i = 1;
        for (; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        while (i != 1) {
            i--;
            System.out.print(i + " ");
        }

        System.out.println("\nЗадание №3");

        int population = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        for (i = 1; i <= 10; i++) {
            population += ((birthRate - mortalityRate) * population / 1000);
            System.out.println("Год " + i + " численность населения составляет " + population);
        }

        System.out.println("Задание №4");
        int total_2 = 15000;
        for (i = 1; total_2 <= 2_000_000; i++) {
            total_2 += (int) (total_2 * 0.07);
            System.out.println("Месяц " + i + " сумма накоплений равна " + total_2 + " рублей");
        }

        System.out.println("Задание №5");
        total_2 = 15000;
        for (i = 1; total_2 <= 2_000_000; i++) {
            total_2 += (int) (total_2 * 0.07);
            if (i % 6 == 0) System.out.println("Месяц " + i + " сумма накоплений равна " + total_2 + " рублей");
        }

        System.out.println("Задание №6");
        total_2 = 15000;
        for (i = 1; i <= (9 * 12); i++) {
            total_2 += (int) (total_2 * 0.07);
            if (i % 6 == 0) System.out.println("Месяц " + i + " сумма накоплений равна " + total_2 + " рублей");
        }

        System.out.println("Задание №7");
        int firstFriday = 3;
        for (i = firstFriday; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }

        System.out.println("Задание №8");
        int start = 2024;
        int pace = 1;
        for (i = start - 200; i <= start + 100; i += pace) {
            if (i % 79 == 0) {
                pace = 79;
                System.out.println(i);
            }
        }
    }
}