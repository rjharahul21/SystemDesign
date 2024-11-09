public class employeeProxy implements employee{
    
    employeeImpl obj;

    public employeeProxy() {
        obj = new employeeImpl();
    }

    @Override
    public void create(String client, employeeDo obj1) throws Exception{

        if(client.equals("ADMIN")) {
            obj.create(client, obj1);
            return;
        }

        throw new Exception("Access denied.");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception{

        if(client.equals("ADMIN")) {
            obj.delete(client, employeeId);
            return;
        }

        throw new Exception("Access denied.");
    }
}
