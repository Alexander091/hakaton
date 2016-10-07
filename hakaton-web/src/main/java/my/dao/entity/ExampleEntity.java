package my.dao.entity;

import javax.persistence.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by alexander on 08.10.16.
 */
//@Entity
public class ExampleEntity {

    private String name = "Name";
    @JsonIgnore
    private String password = "pas";

    public ExampleEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
