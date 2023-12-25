package com.demanou.springbootpharmacy.model.users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="dermatologist_grade")
@DiscriminatorValue("DERMATOLOGIST_GRADE")
@AllArgsConstructor
@NoArgsConstructor
public class DermatologistGrade extends Grade{
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Dermatologist dermatologist;
}
