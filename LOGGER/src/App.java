public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Logger obj = new infoLogger(new debugLogger(new errorLogger(null)));

        obj.log(Logger.INFO, "Good.");
        obj.log(Logger.DEBUG,  "debug");
        obj.log(Logger.ERROR, "Error.");
    }
}
