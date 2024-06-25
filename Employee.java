// 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {
    private String FIO;
    private String job;
    private String email;
    private String phone;
    private double salary;
    private int age;
// Конструктор класса должен заполнять эти поля при создании объекта.
public Employee(String FIO, String job, String email, String phone, double salary, int age) {
        this.FIO = FIO;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    // Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void printInfo() {
        System.out.println("Employee Information:");
        System.out.println("FIO: " + FIO);
        System.out.println("job: " + job);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Employee employee = new Employee("Петров Петр Петрович", "Engineer", "petpetpet@mailbox.com", "892312311", 20000, 20);
        employee.printInfo();
        // 2. Создать массив из 5 сотрудников.
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Иванов Иван Иванович", "Engineer", "iviviv@mailbox.com", "892312312", 30000, 30);
        employeeArray[1] = new Employee("Иванов Иван Петрович", "Engineer", "ivivpet@mailbox.com", "892312313", 40000, 40);
        employeeArray[2] = new Employee("Иванов Иван Васильевич", "Engineer", "ivivvas@mailbox.com", "892312314", 50000, 50);
        employeeArray[3] = new Employee("Иванов Иван Михайлович", "Engineer", "ivivmich@mailbox.com", "892312315", 60000, 60);
        employeeArray[4] = new Employee("Иванов Иван Федорович", "Engineer", "ivivfed@mailbox.com", "892312316", 70000, 70);
}
}