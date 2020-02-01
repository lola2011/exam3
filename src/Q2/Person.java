package Q2;

import java.util.Objects;

public class Person {
    String name;
    String surName;
    String dadName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getDadName() {
        return dadName;
    }

    public void setDadName(String dadName) {
        this.dadName = dadName;
    }

    public Person(String name, String surName, String dadName) {
        this.name = name;
        this.surName = surName;
        this.dadName = dadName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", dadName='" + dadName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surName, person.surName) &&
                Objects.equals(dadName, person.dadName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, dadName);
    }
}
