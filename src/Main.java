import java.util.Random;

public class Main {

    private final static Random RANDOM = new Random();
    private final static String[] NAMES = {"Иван", "Петр", "Сергей", "Владимир", "Максим", "Андрей", "Олег"};
    private final static String[] SURNAMES = {"Иванов", "Петров", "Сергеев", "Владимиров", "Максимов", "Андреев", "Олегов"};
    private final static String[] PATRONYMIC = {"Иванович", "Петрович", "Сергеевич", "Владимирович", "Максимович", "Андреевич", "Олегович"};

   private static Employee[] EMPLOYEES = new Employee[10];

   private static void initEmployees(){
       for (int i = 0; i < EMPLOYEES.length; i++) {
           String fullName = SURNAMES[RANDOM.nextInt(0, SURNAMES.length)] + " " +
                   NAMES[RANDOM.nextInt(0, NAMES.length)] + " " +
                   PATRONYMIC[RANDOM.nextInt(0, PATRONYMIC.length)];
           EMPLOYEES[i] = new Employee(fullName, RANDOM.nextInt(0, 6), RANDOM.nextInt(50_000, 100_000));
       }
   }

   public static void outputOfAllElements(Employee[] employees){
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

   public static int totalSalary(Employee[] employees){
       int summa = 0;
       for (Employee employee : employees) {
           summa += employee.getSalary();
       }
       return summa;
   }

   public static Employee minSalaryEmployee(Employee[] employees){
       Employee minEmployee = null;
       for (Employee employee : employees) {
           if (minEmployee == null || minEmployee.getSalary() < employee.getSalary()) {
               minEmployee = employee;
           }
       }
       return minEmployee;
   }

    public static Employee maxSalaryEmployee(Employee[] employees){
        Employee maxEmployee = null;
        for (Employee employee : employees) {
            if (maxEmployee == null || maxEmployee.getSalary() > employee.getSalary()) {
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }

    public static double averageSalary(Employee[] employees){
       return (double) totalSalary(employees) / employees.length;
    }

    public static void fullNameAllEmployee(Employee[] employees){
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public static void main(String[] args) {
        initEmployees();
        System.out.println("Список сотрудников");
        outputOfAllElements(EMPLOYEES);
        System.out.println("Общая ЗП за месяц");
        System.out.println(totalSalary(EMPLOYEES));
        System.out.println("Минимальная ЗП");
        System.out.println(minSalaryEmployee(EMPLOYEES).getSalary());
        System.out.println("Максимальная ЗП");
        System.out.println(maxSalaryEmployee(EMPLOYEES).getSalary());
        System.out.println("Средняя ЗП");
        System.out.println(averageSalary(EMPLOYEES));
        System.out.println("ФИО всех сотрудников");
        fullNameAllEmployee(EMPLOYEES);
    }
}