package com.demanou.springbootpharmacy.model.medecines;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="medicine_specifications")
public class MedecineSpecification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private Long id;

    @Column(name = "contraindication")
    private String contraindication;

    @Column(name = "dailyDose")
    private int dailyDose;

    @ManyToMany
    @JoinTable(name = "medicine_ingredients", joinColumns = @JoinColumn(name = "medicine_specification_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "ingredient_id", referencedColumnName = "id"))
    private List<Ingredient> ingredients = new ArrayList<Ingredient>();

    @ManyToMany
    @JoinTable(name = "medicine_substitutions", joinColumns = @JoinColumn(name = "medicine_specification_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "medicine_id", referencedColumnName = "id"))
    private List<Medecine> medicineSubstitutions = new ArrayList<Medecine>();

    // ***
    @OneToOne(mappedBy = "medicineSpecification")
    private Medecine medicine;

}
