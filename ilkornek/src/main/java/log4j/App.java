package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Hello world!
 *
 */
public class App 
{  static  final Logger LOGGER = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        PropertyConfigurator.configure("C:\\Users\\Muharrem\\Desktop\\java-log4j\\ilkornek\\src\\main\\resources\\log4j.properties");
        LOGGER.debug("debug message");
        LOGGER.info("info message");
        LOGGER.warn("warn message");
        LOGGER.error("error message");
        LOGGER.fatal("fatal message");
    }
}
