package my.rest;

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

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> get(){
        return new ResponseEntity<String>("Hello1",HttpStatus.OK);
    }
}
