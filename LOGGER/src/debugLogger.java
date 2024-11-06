public class debugLogger extends Logger{
    
    public debugLogger(Logger nexLogger) {
        super(nexLogger);
    }

    public void log(int logLevel, String msg) {
        if(logLevel == DEBUG) {
            System.out.println(msg);
        }
        else {
            super.log(logLevel, msg);
        }
    }
}
