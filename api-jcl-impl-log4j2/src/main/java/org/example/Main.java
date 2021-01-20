package org.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * http://logging.apache.org/log4j/2.x/log4j-jcl/index.html#Usage
 *
 * @author yinghuihong
 * @date 2021-01-20
 */
public class Main {

    /**
     * 用的 jcl 的API，实现则交由 log4j2
     */
    private static final Log logger = LogFactory.getLog(Main.class);

    public static void main(String[] args) {
        logger.debug("xxx debug log");
        logger.info("xxx info log");
        logger.warn("xxx warn log");
        logger.error("xxx error log");
    }
}
