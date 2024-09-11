import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");

        int [] costDataMonth = {100000, 345800, 23060, 56077, 6500};
        int sumCostMonth = 0;
        for (int costDatum : costDataMonth) {
            sumCostMonth += costDatum;
        }
        System.out.println("Сумма трат за месяц составила " + sumCostMonth + " рублей");

        System.out.println("Задание №2");

        int [] costDataWeek = {23060, 56077, 6500, 100000, 345800};
        int minCostWeek = 2147483647;
        int maxCostWeek = -1;
        for (int miniCostDataWeek : costDataWeek) {
            if (minCostWeek > miniCostDataWeek) {
                minCostWeek = miniCostDataWeek;
            }
            if (maxCostWeek < miniCostDataWeek) {
                maxCostWeek = miniCostDataWeek;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minCostWeek + " рублей. Максимальная сумма трат за неделю составила " + maxCostWeek + " рублей");

        System.out.println("Задание №3");

        int [] costDataMonth2 = {56077, 345800, 123060, 256077, 6500};
        float averageCostDataMonth = 0f;
        for (int i : costDataMonth2) {
            averageCostDataMonth += i;
        }
        averageCostDataMonth /= costDataMonth2.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageCostDataMonth + " рублей");

        System.out.println("Задание №4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int indexWhitespace = 0;

        for (int i = 0; i < reverseFullName.length; i++) {
            if (reverseFullName[i] == ' '){
                indexWhitespace = i;
                break;
            }
        }

        int nameLength = indexWhitespace;
        if (nameLength % 2 == 1){
            nameLength++;
        }
        for (int i = nameLength - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.print(" ");
        int variableLength = (reverseFullName.length) - indexWhitespace - 1;
        if (variableLength % 2 == 1){
            variableLength++;
        }
        for (int i = reverseFullName.length - 1; i > nameLength; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}