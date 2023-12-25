package com.demanou.springbootpharmacy.model.users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="dermatologist_complaint")
@DiscriminatorValue("DERMATOLOGIST_COMPLAINT")
@AllArgsConstructor
@NoArgsConstructor
public class DermatologistComplaint extends Complaint{
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Dermatologist dermatologist;
}
