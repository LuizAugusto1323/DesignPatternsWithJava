package br.com.dio.patterns.designPatterns.builder;

public class Person {
    private final String name;
    private final String email;
    private final String phone;

    private Person(
            String name,
            String email,
            String phone
    ) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String toString() {
        return name + ", " + email + ", " + phone;
    }

    // Inner static Builder class
    public static class Builder {
        private String name;
        private String email;
        private String phone;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Person build() {
            return new Person(name, email, phone);
        }
    }
}
