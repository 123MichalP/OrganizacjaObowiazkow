package com.example.podzialobowiazkow;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "chore")
public class Chore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer priority;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public Chore(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Chore chore = (Chore) o;
        return Objects.equals(id, chore.id) && Objects.equals(name, chore.name) && Objects.equals(priority, chore.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, priority);
    }
}
