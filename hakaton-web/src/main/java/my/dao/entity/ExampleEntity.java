package my.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by alexander on 08.10.16.
 */
@Entity
public class ExampleEntity {

    private String name;
    @Id
    @GeneratedValue
    private Long id;
    @JsonIgnore
    private String password;

    @OneToMany(mappedBy = "parent")
    private Set<ExampleEntity> children = new HashSet<>();

    @JsonIgnore
    @ManyToOne
    private ExampleEntity parent;

    public ExampleEntity() {
    }

    public ExampleEntity(ExampleEntity parent, String name) {
        this.parent = parent;
        this.name = name;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<ExampleEntity> getChildren() {
        return children;
    }

    public void setChildren(Set<ExampleEntity> children) {
        this.children = children;
    }

    public ExampleEntity getParent() {
        return parent;
    }

    public void setParent(ExampleEntity parent) {
        this.parent = parent;
    }
}
