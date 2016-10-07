package my.resources;

import my.dao.entity.ExampleEntity;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.Link;

/**
 * Created by alexander on 08.10.16.
 */
public class ExampleResources extends ResourceSupport {

    private ExampleEntity exampleEntity;

    public ExampleResources(ExampleEntity exampleEntity) {
        this.exampleEntity = exampleEntity;
        this.add(new Link(exampleEntity.getName(), "name"));
    }

    public ExampleEntity getExampleEntity() {
        return exampleEntity;
    }
}
