public class employeeImpl implements employee{
    
    public void create(String client, employeeDo obj) {
        System.out.println("New object created.");
    }
    public void delete(String client, int employeeId) {
        System.out.println("This employee is deleted.");
    }
}
