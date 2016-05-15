package tables;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by FromxSoul on 15.05.2016.
 */
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long id;

    @Column(name = "role_title")
    private String title;

    @OneToMany(mappedBy = "role")
    private Set<User> users = new HashSet<User>();

    public Role() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
