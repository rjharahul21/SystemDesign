public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        try {
            employeeProxy obj = new employeeProxy();
            obj.create("ADMIN", new employeeDo());
            obj.delete("USER", 0);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
