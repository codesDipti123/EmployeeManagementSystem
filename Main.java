public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        Employee emp1 = new Employee(1, "Alice", "Developer", 75000);
        Employee emp2 = new Employee(2, "Bob", "Manager", 90000);

        manager.addEmployee(emp1);
        manager.addEmployee(emp2);

        manager.displayEmployees();
        
        SecretKey secretKey = new SecretKey("mySecretAPIKey123");
        System.out.println("Secret Key: " + secretKey.getKey());
    }
}
