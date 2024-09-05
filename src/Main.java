public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println("Задание №2");
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }

        System.out.println("Задание №3");
        for (int i = 0; i <= 17; i += 2){
            System.out.println(i);
        }

        System.out.println("Задание №4");
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }

        System.out.println("Задание №5");
        for (int i = 1904; i <= 2096; i += 4){
            System.out.println(i + " год является высокосным");
        }

        System.out.println("Задание №6");
        for (int i = 7; i <= 98; i += 7){
            System.out.print(i + " ");
        }

        System.out.println("\nЗадание №7");
        for (int i = 1; i <= 512; i *= 2){
            System.out.print(i + " ");
        }

        System.out.println("\nЗадание №8");
        int total_1 = 0;
        for (int i = 1; i <= 12; i++){
            total_1 += 29000;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total_1 + " рублей");
        }

        System.out.println("Задание №9");
        int total_2 = 0;
        for (int i = 1; i <= 12; i++){
            total_2 += (int) (total_2 * 0.01);
            total_2 += 29000;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total_2 + " рублей");
        }

        System.out.println("Задание №10");
        for (int i = 1; i <= 10; i++){
            System.out.println("2*" + i + "=" + 2*i);
        }
    }
}