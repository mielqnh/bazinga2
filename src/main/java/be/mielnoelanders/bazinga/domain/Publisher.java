package be.mielnoelanders.bazinga.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Publisher extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = -1926628474232469673L;

    // FIELDS
    private String name;
    private String website;

    // FIELDS WITH MAPPINGS
    @OneToOne
    @JoinColumn(name ="addressid")
    private Address address;

    // CONSTUCTORS
    public Publisher(){}

    // GETTERS & SETTERS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }

// OVERRIDES
    @Override
    public String toString() {
        return "Publisher{" +
                ", name='" + name + '\'' +
                ", website='" + website + '\'' +
                ", address='" + address +
                '}';
    }
}
