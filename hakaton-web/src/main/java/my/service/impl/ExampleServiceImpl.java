package my.service.impl;

import my.dao.entity.ExampleEntity;
import my.dao.repository.ExampleDao;
import my.service.ExampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by alexander on 07.10.16.
 */
@Component
public class ExampleServiceImpl implements ExampleService{
    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleServiceImpl.class);

    @Autowired
    private ExampleDao exampleDao;

    public ExampleServiceImpl() {
        LOGGER.error("Test ERROR");
        LOGGER.warn("Test WARN");
        LOGGER.info("Test INFO");
        LOGGER.debug("Test DEBUG");
        LOGGER.trace("Test TRACE");
    }

    public ExampleDao getExampleDao() {
        return exampleDao;
    }

    public void setExampleDao(ExampleDao exampleDao) {
        this.exampleDao = exampleDao;
    }


    @Transactional
    public ExampleEntity getEntity(){
        return exampleDao.getEntity();
    }

}
