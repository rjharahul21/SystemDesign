public class Logger{

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    Logger nextLogger;

    Logger(Logger nLogger) {
        this.nextLogger = nLogger;
    }

    public void log(int logLevel, String msg) {
        nextLogger.log(logLevel, msg);
    }
}