package com.demanou.springbootpharmacy.model.users;

import com.demanou.springbootpharmacy.model.pharmacy.Pharmacy;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="pharmacy_complaint")
@DiscriminatorValue("PHARMACY_COMPLAINT")
@AllArgsConstructor
@NoArgsConstructor
public class PharmacyComplaint extends Complaint{
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Pharmacy pharmacy;
}
