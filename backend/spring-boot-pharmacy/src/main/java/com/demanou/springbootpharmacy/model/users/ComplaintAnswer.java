package com.demanou.springbootpharmacy.model.users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "complaint_answers")
@AllArgsConstructor
@NoArgsConstructor
public class ComplaintAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private Long id;

    @Column(name="text", nullable = false)
    private String text;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "complaint_id", referencedColumnName = "id")
    private Complaint complaint;
}
