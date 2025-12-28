public class LogLevels {
    
    public static String message(String logLine) {
        String[] string = logLine.split(":");
        String text = string[1];
        return text.trim();
    }

    public static String logLevel(String logLine) {
        String[] string = logLine.split(":");
        String text = string[0];
        return text.substring(1, text.length() - 1).toLowerCase();
    }

    public static String reformat(String logLine) {
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
