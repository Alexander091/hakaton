package my.dao.repository.impl;

import my.dao.entity.ExampleEntity;
import my.dao.repository.ExampleDao;
import org.springframework.stereotype.Repository;

/**
 * Created by alexander on 08.10.16.
 */
@Repository
public class ExampleDaoImpl implements ExampleDao {
    public ExampleEntity getEntity() {
        return new ExampleEntity();
    }
}
