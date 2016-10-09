package my.dao.repository;

import my.dao.entity.ExampleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by alexander on 08.10.16.
 */
public interface ExampleDao /*extends JpaRepository<ExampleEntity, Long>*/ {
    ExampleEntity getEntity();
}
