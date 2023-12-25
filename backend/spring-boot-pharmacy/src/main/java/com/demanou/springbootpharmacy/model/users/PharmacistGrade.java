package com.demanou.springbootpharmacy.model.users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="pharmacist_grade")
@DiscriminatorValue("PHARMACIST_GRADE")
@AllArgsConstructor
@NoArgsConstructor
public class PharmacistGrade extends Grade{
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Pharmacist pharmacist;
}
