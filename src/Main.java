import java.util.Random;

public class Main {

    private final static Random RANDOM = new Random();
    private final static String[] NAMES = {"Иван", "Петр", "Сергей", "Владимир", "Максим", "Андрей", "Олег"};
    private final static String[] SURNAMES = {"Иванов", "Петров", "Сергеев", "Владимиров", "Максимов", "Андреев", "Олегов"};
    private final static String[] PATRONYMIC = {"Иванович", "Петрович", "Сергеевич", "Владимирович", "Максимович", "Андреевич", "Олегович"};

   private static final Employee[] EMPLOYEES = new Employee[10];

   private static void initEmployees(){
       for (int i = 0; i < EMPLOYEES.length; i++) {
           String fullName = SURNAMES[RANDOM.nextInt(0, SURNAMES.length)] + " " +
                   NAMES[RANDOM.nextInt(0, NAMES.length)] + " " +
                   PATRONYMIC[RANDOM.nextInt(0, PATRONYMIC.length)];
           EMPLOYEES[i] = new Employee(fullName, RANDOM.nextInt(0, 6), RANDOM.nextInt(50_000, 100_000));
       }
   }

   public static void outputOfAllElements(){
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

   public static int totalSalary(){
       int summa = 0;
       for (Employee employee : EMPLOYEES) {
           summa += employee.getSalary();
       }
       return summa;
   }

   public static Employee minSalaryEmployee(){
       Employee minEmployee = null;
       for (Employee employee : EMPLOYEES) {
           if (minEmployee == null || minEmployee.getSalary() > employee.getSalary()) {
               minEmployee = employee;
           }
       }
       return minEmployee;
   }

    public static Employee maxSalaryEmployee(){
        Employee maxEmployee = null;
        for (Employee employee : EMPLOYEES) {
            if (maxEmployee == null || maxEmployee.getSalary() < employee.getSalary()) {
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }

    public static double averageSalary(){
       return (double) totalSalary() / EMPLOYEES.length;
    }

    public static void fullNameAllEmployee(){
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getFullName());
        }
    }

    public static void main(String[] args) {
        initEmployees();
        System.out.println("Список сотрудников");
        outputOfAllElements();
        System.out.println("Общая ЗП за месяц");
        System.out.println(totalSalary());
        System.out.println("Минимальная ЗП");
        System.out.println(minSalaryEmployee().getSalary());
        System.out.println("Максимальная ЗП");
        System.out.println(maxSalaryEmployee().getSalary());
        System.out.println("Средняя ЗП");
        System.out.println(averageSalary());
        System.out.println("ФИО всех сотрудников");
        fullNameAllEmployee();
    }
}