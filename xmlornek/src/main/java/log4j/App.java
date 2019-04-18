package log4j;

import org.apache.log4j.Logger;

import org.apache.log4j.xml.DOMConfigurator;

public class App
{
    static final Logger LOGGER = Logger.getLogger(App.class);
    public static void main( String[] args ) {
        DOMConfigurator.configure("write.xml");
        LOGGER.info("INFO");
        LOGGER.debug("DEBUG");
        LOGGER.warn("WARN");
        LOGGER.fatal("FATAL");
        LOGGER.error("ERROR");


    }

}
