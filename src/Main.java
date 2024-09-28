public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author vysotsky  = new Author("Владимир", "Высоцкий");

        Book dubrovsky = new Book("Дубровкий", pushkin, 1840);
        Book collectionVysotsky = new Book("Сборник произведений Высоцкиго", vysotsky, 1983);

        System.out.println(dubrovsky.getYearPublication());
        dubrovsky.setYearPublication(1841);
        System.out.println(dubrovsky.getYearPublication());
    }
}