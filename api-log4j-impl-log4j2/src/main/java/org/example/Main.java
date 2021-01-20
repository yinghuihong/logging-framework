package org.example;

import org.apache.log4j.Logger;

/**
 * http://logging.apache.org/log4j/2.x/log4j-1.2-api/index.html#Usage
 *
 * @author yinghuihong
 * @date 2021-01-20
 */
public class Main {

    /**
     * 用的 log4j 的API，实现则交由 log4j2
     */
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        logger.debug("xxx debug log");
        logger.info("xxx info log");
        logger.warn("xxx warn log");
        logger.error("xxx error log");
    }
}
