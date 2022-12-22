package com.example.cvtheme.entities;

import com.example.cvtheme.shared.enums.StudentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "students")
public class StudentEntity extends User {
    @Column
    private StudentStatus status;
    @ManyToOne
    @JoinColumn(name = "promoId")
    private PromoEntity promo;
    @OneToMany(mappedBy = "student")
    private List<ResumeEntity> resumes;
    @OneToMany(mappedBy = "student")
    private List<MotivationLetterEntity> letters;
}
