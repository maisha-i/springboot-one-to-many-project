package com.example.karateclub.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;;
    @Column
    private String email;
    @Column
    private String kyuGrade;

    @ManyToOne
    @JoinColumn(name= "sensei_id", nullable = false)
    private Sensei sensei;


    // Constructor

    public Student(Long id, String name, String email, String kyuGrade, Sensei sensei) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.kyuGrade = kyuGrade;
        this.sensei = sensei;
    }
    public Student() {
    }
    // Getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKyuGrade() {
        return kyuGrade;
    }

    public void setKyuGrade(String kyuGrade) {
        this.kyuGrade = kyuGrade;
    }

    public Sensei getSensei() {
        return sensei;
    }

    public void setSensei(Sensei sensei) {
        this.sensei = sensei;
    }
}
