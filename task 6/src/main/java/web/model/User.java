package web.model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "Users")
@Component
public class User {
    @Column
    private String name;
    @Column
    private String surname;

    @Column
    private int age;
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public User(){}

    public User(String name, String surname, int age, Long id) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + name + '\'' +
                ", model='" + surname + '\'' +
                ", serial=" + age +
                '}';
    }

}
