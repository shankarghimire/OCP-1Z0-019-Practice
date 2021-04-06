package examples.ch12.set01;

import java.util.logging.*;

public class Test {
    private static Logger logger = Logger.getLogger(examples.ch12.set01.Test.class.getName());
    public static void main(String[] args) {
        try{

        }catch (Exception e){
            logger.log(Level.WARNING, "Your Exception", e);
        }
        logger.log(Level.INFO, "Your Message");
        logger.info("Your Message");
    }
}
