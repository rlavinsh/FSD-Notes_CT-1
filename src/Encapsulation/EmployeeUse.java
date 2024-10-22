package Encapsulation;

public class EmployeeUse {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Amit");
        e1.setSalary(25000);
        e1.setAge(25);
        System.out.println(e1.getName());
        System.out.println(e1.getAge());
        System.out.println(e1.getSalary());
    }
}
