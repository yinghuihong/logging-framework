package org.example;

import java.util.logging.Logger;

/**
 * @author yinghuihong
 * @date 2021-01-20
 */
public class Main {

    // 放在Logger.getLogger前
    static {
        // see http://logging.apache.org/log4j/2.x/log4j-jul/index.html#Usage
        System.setProperty("java.util.logging.manager", "org.apache.logging.log4j.jul.LogManager");
    }

    /**
     * 用的 jul 的API，实现则交由 log4j2
     */
    private static final Logger logger = Logger.getLogger(Main.class.getSimpleName());

    public static void main(String[] args) {
        logger.fine("xxx debug log");
        logger.info("xxx info log");
        logger.warning("xxx warn log");
        logger.severe("xxx error log");
    }
}
