package com.example.cvtheme.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class CmeEntity extends User {
    @OneToMany(mappedBy = "cme")
    private List<CommentEntity> comments;

}
