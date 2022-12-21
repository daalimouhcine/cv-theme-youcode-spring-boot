package com.example.cvtheme.entities;

import com.example.cvtheme.shared.enums.DocumentType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "cmeId", nullable = false)
    private CmeEntity cme;
    @ManyToOne
    @JoinColumn(name = "resumeId")
    private ResumeEntity resume;
    @ManyToOne
    @JoinColumn(name = "letterId")
    private MotivationLetterEntity motivationLetter;
    @Column
    private String message;
    @Column
    private DocumentType documentType;
    @Column
    private Timestamp date;
    
}
