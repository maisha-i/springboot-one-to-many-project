package com.example.karateclub.components;

import com.example.karateclub.model.Sensei;
import com.example.karateclub.model.Student;
import com.example.karateclub.repository.SenseiRepository;
import com.example.karateclub.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Dataloader implements ApplicationRunner {

    @Autowired
    SenseiRepository senseiRepository;

    public Dataloader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Sensei s1 = new Sensei(null, "Yunus", "Kyu 1");
        Sensei s2 = new Sensei(null, "Khadijah", "Kyu 1");
        Sensei s3 = new Sensei(null, "Harry", "Kyu 1");
        Sensei s4 = new Sensei(null, "Emma", "Kyu 1");
        Sensei s5 = new Sensei(null, "Ali", "Kyu 1");
        Sensei s6 = new Sensei(null, "Mal", "Kyu 1");
        Sensei s7 = new Sensei(null, "Adam", "Kyu 1");
        Sensei s8 = new Sensei(null, "John", "Kyu 1");
        Sensei s9 = new Sensei(null, "Malik", "Kyu 1");
        Sensei s10 = new Sensei(null, "Tan", "Kyu 1");

        Student st1 = new Student(null,  "Maria", "marie@outlook,com", "1st kyu", s1);
        Student st2 = new Student(null,  "Ellie", "ellie@outlook,com", "1st kyu", s1);
        Student st3 = new Student(null,  "Zak", "zak@outlook,com", "1st kyu", s1);
        Student st4 = new Student(null,  "Amber", "amber@outlook,com", "2nd kyu", s2);
        Student st5 = new Student(null,  "Pete", "pete@outlook,com", "3rd kyu", s3);
        Student st6 = new Student(null,  "Amara", "amara@outlook,com", "4th kyu", s4);
        Student st7 = new Student(null,  "Robyn", "robyn@outlook,com", "5th kyu", s5);
        Student st8 = new Student(null,  "Sarah", "sarah@outlook,com", "6th kyu", s6);
        Student st9 = new Student(null,  "Izzy", "izzy@outlook,com", "6th kyu", s6);
        Student st10 = new Student(null,  "Hanif", "hanif@outlook,com", "7th kyu", s7);
        Student st11 = new Student(null,  "Sandra", "sandra@outlook,com", "7th kyu", s7);
        Student st12 = new Student(null,  "Yakub", "marie@outlook,com", "7th kyu", s7);
        Student st13 = new Student(null,  "Adil", "adil@outlook,com", "8th kyu", s8);
        Student st14 = new Student(null,  "Tom", "tom@outlook,com", "9th kyu", s9);
        Student st15 = new Student(null,  "Yusuf", "yusuf@outlook,com", "10th kyu", s10);
        Student st16 = new Student(null,  "Hope", "hope@outlook,com", "10th kyu", s10);

        s1.setStudents(List.of(st1, st2, st3));
        s2.setStudents(List.of(st4));
        s3.setStudents(List.of(st5));
        s4.setStudents(List.of(st6));
        s5.setStudents(List.of(st7));
        s6.setStudents(List.of(st8, st9));
        s7.setStudents(List.of(st10, st11, st12));
        s8.setStudents(List.of(st13));
        s9.setStudents(List.of(st14));
        s10.setStudents(List.of(st15, st16));

        senseiRepository.saveAll(List.of(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10));


    }


}
