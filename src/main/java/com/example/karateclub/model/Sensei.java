package com.example.karateclub.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sensei")

public class Sensei {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String teachingGrade;

    @JsonIgnoreProperties({"sensei"})
    @OneToMany(mappedBy = "sensei", cascade = CascadeType.ALL)
    private List<Student> students;


    // Constructor

    public Sensei(Long id, String name, String teachingGrade) {
        this.id = id;
        this.name = name;
        this.teachingGrade = teachingGrade;
    }
    public Sensei() {
    }
    // Getters and Setters

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

    public String getTeachingGrade() {
        return teachingGrade;
    }

    public void setTeachingGrade(String teachingGrade) {
        this.teachingGrade = teachingGrade;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}