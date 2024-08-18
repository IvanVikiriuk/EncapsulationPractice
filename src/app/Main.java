package app;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Vladimir Melnyk",
                "Manager", "melnyk.v@gmail.com",
                "+380663962268", 30);

        System.out.println("Employee created: " + employee.getFullName());

        Car myCar = new Car();
        myCar.start();
    }
}
