public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");

        byte age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задание №2");

        byte temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + ", градусов, нужно надеть шапку.");
        }
        else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }

        System.out.println("Задание №3");

        short speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        }
        else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно.");
        }

        System.out.println("Задание №4");

        byte agePerson = 18;
        if (agePerson >= 2 && agePerson <= 6) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад.");
        }
        if (agePerson >= 7 && agePerson <= 17) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу.");
        }
        if (agePerson >= 18 && agePerson <= 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в университет.");
        }
        if (agePerson > 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить на работу.");
        }

        System.out.println("Задание №5");

        byte agePersonLimitations = 18;
        if (agePersonLimitations < 5) {
            System.out.println("Если возраст ребенка равен " + agePersonLimitations + ", то ему нельзя кататься на аттракционе.");
        }
        if (agePersonLimitations >= 5 && agePersonLimitations < 14) {
            System.out.println("Если возраст ребенка равен " + agePersonLimitations + ", то ему можно кататься на аттракционе в сопровождении.");
        }
        if (agePersonLimitations >= 14) {
            System.out.println("Если возраст ребенка равен " + agePersonLimitations + ", то ему без сопровождения взрослого.");
        }

        System.out.println("Задание №6");

        short numberPeople = 70;
        if (numberPeople <= 102){
            if (numberPeople <= 60) {
                System.out.println("Есть сидячие места");
            }
            else {
                System.out.println("Есть стоячие места");
            }
        }
        else {
            System.out.println("Мест в вагоне нет");
        }

        System.out.println("Задание №7");

        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three){
            System.out.println("Самое большое число " + one);
        }
        if (two >= one && two >= three){
            System.out.println("Самое большое число " + two);
        }
        if (three >= one && three >= two){
            System.out.println("Самое большое число " + three);
        }
    }
}