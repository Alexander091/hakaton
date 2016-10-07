package my.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alexander on 05.10.16.
 */
@RestController
@RequestMapping("/example")
public class ExampleRest {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleRest.class);

    public ExampleRest() {
        LOGGER.error("Test ERROR");
        LOGGER.warn("Test WARN");
        LOGGER.info("Test INFO");
        LOGGER.debug("Test DEBUG");
        LOGGER.trace("Test TRACE");
    }

    @RequestMapping(value= "/get", method = RequestMethod.GET)
    public ResponseEntity<?> get(){
        return new ResponseEntity<String>("Hello1",HttpStatus.OK);
    }
}
