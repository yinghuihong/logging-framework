package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author yinghuihong
 * @date 2021-01-20
 */
public class Main {

    /**
     * 用的 log4j2 的API，实现则交由 slf4j
     */
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.debug("xxx debug log");
        logger.info("xxx info log");
        logger.warn("xxx warn log");
        logger.error("xxx error log");
    }
}
