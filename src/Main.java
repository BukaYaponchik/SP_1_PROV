public class Main {
    public static void main(String[] args) {
       System.out.println("Задание №1");

       var dog = 8.0;
       var cat = 3.6;
       var paper = 763789;
       System.out.println(dog);
       System.out.println(cat);
       System.out.println(paper);

        System.out.println("Задание №2");

        dog = 8.0 + 4;
        cat = 3.6 + 4;
        paper = 763789 + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание №3");

        dog = 8.0 - 3.5;
        cat = 3.6 - 1.6;
        paper = 763789 - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание №4");

        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        System.out.println("Задание №5");

        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        System.out.println("Задание №6");

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var massesSum = firstBoxer + secondBoxer;
        var massesDifference = secondBoxer - firstBoxer;
        System.out.println(massesSum);
        System.out.println(massesDifference);

        System.out.println("Задание №7");

        var firstRemainder = firstBoxer % secondBoxer;
        System.out.println(firstRemainder);
        var secondRemainder = secondBoxer % firstBoxer;
        System.out.println(secondRemainder);

        System.out.println("Задание №8");

        var totalHours = 640;
        var hoursPerDay = 8;
        var numberEmployees = totalHours / hoursPerDay;
        System.out.println("Всего работников в компании - " + numberEmployees);
        numberEmployees += 94;
        System.out.println("Если в компании работает " + numberEmployees + " человек, то всего " + totalHours / numberEmployees + " часов работы может быть поделено между сотрудниками");

    }
}