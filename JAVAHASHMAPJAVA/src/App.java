public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        myHashmap<Integer, String> obj = new myHashmap<Integer, String>(6);

        obj.put(1, "Rahul");
        obj.put(2, "Jha");

        String val = obj.get(2);
        System.out.println(val);
    }
}
