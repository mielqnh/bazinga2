package be.mielnoelanders.bazinga.actions.to;

public class GameTO {

    private int id;
    private String title;
    private int edition;
    private int officielePrijsInEurocent;

    public int getId() {
        return id;
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

    private GameTO(Builder builder) {
        id = builder.id;
        title = builder.title;
        edition = builder.edition;
        officielePrijsInEurocent = builder.officielePrijsInEurocent;
    }

    public static Builder newBuilder() {
        return new Builder();
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

        public GameTO build() {
            return new GameTO(this);
        }
    }
}
