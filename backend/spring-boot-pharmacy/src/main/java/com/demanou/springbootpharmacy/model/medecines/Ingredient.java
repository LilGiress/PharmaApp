package com.demanou.springbootpharmacy.model.medecines;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="ingredients")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    // ***
    @ManyToMany(mappedBy = "ingredients")
    private List<MedecineSpecification> medecineSpecification = new ArrayList<MedecineSpecification>();

}
