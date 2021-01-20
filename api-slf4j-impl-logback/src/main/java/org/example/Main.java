package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yinghuihong
 * @date 2021-01-20
 */
public class Main {

    /**
     * 用的 slf4j 的API，实现则交由 logback
     */
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.debug("xxx debug log");
        logger.info("xxx info log");
        logger.warn("xxx warn log");
        logger.error("xxx error log");
    }
}
