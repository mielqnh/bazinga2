package be.mielnoelanders.bazinga.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Game extends AbstractEntity implements Serializable {

    @Column(name = "TITLE")
    private String title;

    @Column(name = "EDITION")
    private int edition;

    @Column(name = "OFFICAL_PRICE")
    private int officielePrijsInEurocent; //Als we alles in eurocent opslaan moeten we geen kommagetallen bijhouden

    public Game(){}

    private Game(Builder builder) {
        setId(builder.id);
        title = builder.title;
        edition = builder.edition;
        officielePrijsInEurocent = builder.officielePrijsInEurocent;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getTitle() {
        return title;
    }

    public int getEdition() {
        return edition;
    }

    public int getOfficielePrijsInEurocent() {
        return officielePrijsInEurocent;
    }



    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", edition=" + edition +
                ", officielePrijsInEurocent=" + officielePrijsInEurocent +
                '}';
    }

    public static final class Builder {
        private int id;
        private String title;
        private int edition;
        private int officielePrijsInEurocent;

        private Builder() {
        }

        public Builder withId(int val) {
            id = val;
            return this;
        }

        public Builder withTitle(String val) {
            title = val;
            return this;
        }

        public Builder withEdition(int val) {
            edition = val;
            return this;
        }

        public Builder withOfficielePrijsInEurocent(int val) {
            officielePrijsInEurocent = val;
            return this;
        }

        public Game build() {
            return new Game(this);
        }
    }
}
