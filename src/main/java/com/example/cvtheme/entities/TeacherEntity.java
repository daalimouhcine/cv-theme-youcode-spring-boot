package com.example.cvtheme.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "teachers")
public class TeacherEntity extends User {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "promoId", referencedColumnName = "id")
    private PromoEntity promo;
}
