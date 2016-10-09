package my.dao.repository.impl;

import my.dao.entity.ExampleEntity;
import my.dao.repository.ExampleDao;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by alexander on 08.10.16.
 */
@Repository
public class ExampleDaoImpl implements ExampleDao {


    public ExampleEntity getEntity() {
        return new ExampleEntity();
    }
}
