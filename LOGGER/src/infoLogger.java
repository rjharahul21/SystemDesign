public class infoLogger extends Logger{
    
    public infoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(int logLevel, String msg) {
        if(logLevel == INFO) {
            System.out.println(msg);
        }
        else {
            super.log(logLevel, msg);
        }
    }
}
