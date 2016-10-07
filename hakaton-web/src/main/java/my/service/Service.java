package my.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by alexander on 07.10.16.
 */
@Component
public class Service {
    private static final Logger LOGGER = LoggerFactory.getLogger(Service.class);

    public Service() {
        LOGGER.error("Test ERROR");
        LOGGER.warn("Test WARN");
        LOGGER.info("Test INFO");
        LOGGER.debug("Test DEBUG");
        LOGGER.trace("Test TRACE");
    }
}
