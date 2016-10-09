package my;

import my.dao.entity.ExampleEntity;
import my.dao.repository.ExampleDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * Created by alexander on 06.10.16.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(ExampleDao exampleDao) {
        return (evt) ->
                Arrays.asList("jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(","))
                        .forEach(a -> {
                            ExampleEntity parent = exampleDao.save(new ExampleEntity(null, a));
                            exampleDao.save(new ExampleEntity(parent, "child 1 for " + a));
                            exampleDao.save(new ExampleEntity(parent, "child 2 for " + a));
                        });
    }

}
