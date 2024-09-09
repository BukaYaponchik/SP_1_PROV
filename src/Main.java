import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");

        int [] firstMas = new int []{1, 2, 3};
        double [] secondMas = {1.57, 7.654, 9.986};
        boolean [] thirdMas = {true, true, true};

        System.out.println("Задание №2");

        for (int i = 0; i < firstMas.length; i++) {
            if(i == firstMas.length - 1) System.out.print(firstMas[i]);
            else System.out.print(firstMas[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < secondMas.length; i++) {
            if(i == secondMas.length - 1) System.out.print(secondMas[i]);
            else System.out.print(secondMas[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < thirdMas.length; i++) {
            if(i == thirdMas.length - 1) System.out.print(thirdMas[i]);
            else System.out.print(thirdMas[i] + ", ");
        }
        System.out.println();

        System.out.println("Задание №3");

        for (int i = firstMas.length - 1; i >= 0; i--) {
            if(i == 0) System.out.print(firstMas[i]);
            else System.out.print(firstMas[i] + ", ");
        }
        System.out.println();
        for (int i = secondMas.length - 1; i >= 0; i--) {
            if(i == 0) System.out.print(secondMas[i]);
            else System.out.print(secondMas[i] + ", ");
        }
        System.out.println();
        for (int i = thirdMas.length - 1; i >= 0; i--) {
            if(i == 0) System.out.print(thirdMas[i]);
            else System.out.print(thirdMas[i] + ", ");
        }
        System.out.println();

        System.out.println("Задание №4");

        for (int i = 0; i < firstMas.length; i++) {
            if (firstMas[i] % 2 == 1) firstMas[i]++;
        }
        System.out.println(Arrays.toString(firstMas));
    }
}