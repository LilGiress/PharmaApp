package com.demanou.springbootpharmacy.model.users;

import com.demanou.springbootpharmacy.model.pharmacy.Pharmacy;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="pharmacy_grade")
@DiscriminatorValue("PHARMACY_GRADE")
@AllArgsConstructor
@NoArgsConstructor
public class PharmacyGrade extends Grade{
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Pharmacy pharmacy;
}
