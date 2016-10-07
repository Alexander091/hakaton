package my.rest;

import my.dao.entity.ExampleEntity;
import my.resources.ExampleResources;
import my.service.ExampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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

    @Autowired
    private ExampleService exampleService;

    public ExampleRest() {
        LOGGER.error("Test ERROR");
        LOGGER.warn("Test WARN");
        LOGGER.info("Test INFO");
        LOGGER.debug("Test DEBUG");
        LOGGER.trace("Test TRACE");
    }

    @RequestMapping(value= "/get", method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ExampleEntity> get(){
        ExampleEntity entity = exampleService.getEntity();
        return new ResponseEntity<ExampleEntity>(entity,HttpStatus.OK);
    }

    public ExampleService getExampleService() {
        return exampleService;
    }

    public void setExampleService(ExampleService exampleService) {
        this.exampleService = exampleService;
    }
}
