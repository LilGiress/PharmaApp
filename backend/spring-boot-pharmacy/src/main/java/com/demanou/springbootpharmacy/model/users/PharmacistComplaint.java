package com.demanou.springbootpharmacy.model.users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="pharmacist_complaint")
@DiscriminatorValue("PHARMACIST_COMPLAINT")
@AllArgsConstructor
@NoArgsConstructor
public class PharmacistComplaint extends Complaint{
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Pharmacist pharmacist;
}
