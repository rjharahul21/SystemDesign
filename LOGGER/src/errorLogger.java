public class errorLogger extends Logger{
    
    public errorLogger(Logger nexLogger) {
        super(nexLogger);
    }

    public void log(int logLevel, String msg) {
        if(logLevel == ERROR) {
            System.out.println(msg);
        }
        else {
            super.log(logLevel, msg);
        }
    }
}
