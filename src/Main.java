public class Main {

    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author vysotsky = new Author("Владимир", "Высоцкий");

        Book dubrovsky = new Book("Дубровкий", pushkin, 1840);
        Book collectionVysotsky = new Book("Сборник произведений Высоцкого", vysotsky, 1983);

        System.out.println("Использование toString с форматным выводом");
        System.out.println("----Первая книга----");
        System.out.println(dubrovsky.toString());
        System.out.println("----Вторая книга----");
        System.out.println(collectionVysotsky.toString());
        System.out.println("----Первый автор----");
        System.out.println(pushkin.toString());
        System.out.println("----Второй автор----");
        System.out.println(vysotsky.toString());
        System.out.println();

        System.out.println("Использование equals, где для книг не сравнивается год выпуска");
        System.out.println("Проверка Дубровского и Сборника ->" + dubrovsky.equals(collectionVysotsky));
        Book dubrovsky2 = new Book("Дубровкий", pushkin, 1840);
        System.out.println("Проверка Дубровского и Дубровского2 ->" + dubrovsky.equals(dubrovsky2));
        dubrovsky2.setYearPublication(1841);
        System.out.println("Проверка Дубровского и Дубровского2 с разными годами выпуска ->" + dubrovsky.equals(dubrovsky2));
        System.out.println();

        System.out.println("Использование hashCode");
        System.out.println("Проверка hash Дубровского и Сборника ->" + dubrovsky.hashCode() + " " + collectionVysotsky.hashCode());
        System.out.println("Проверка hash Дубровского и Дубровского2 ->" + dubrovsky.hashCode() + " " + dubrovsky2.hashCode());

    }
}