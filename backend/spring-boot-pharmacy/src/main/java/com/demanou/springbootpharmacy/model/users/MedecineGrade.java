package com.demanou.springbootpharmacy.model.users;

import com.demanou.springbootpharmacy.model.medecines.Medecine;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="medicine_grade")
@DiscriminatorValue("MEDICINE_GRADE")
@AllArgsConstructor
@NoArgsConstructor
public class MedecineGrade extends Grade{
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Medecine medicine;
}
