/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

import java.util.List;

/**
 *
 * @author thuannd
 */
public class Person {

    private String name;
    private int age;
    private List<String> languages;

    public static class Builder {

        private String name;
        private int age;
        private List<String> languages;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder languages(List<String> languages) {
            this.languages = languages;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    private Person(Builder builder) {
        name = builder.name;
        age = builder.age;
        languages = builder.languages;
    }

    public String getInfor() {
        return name + age + languages.get(0);
    }

}
