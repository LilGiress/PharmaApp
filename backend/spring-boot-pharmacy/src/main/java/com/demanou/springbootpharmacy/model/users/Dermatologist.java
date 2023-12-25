package com.demanou.springbootpharmacy.model.users;

import com.demanou.springbootpharmacy.model.pharmacy.Pharmacy;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="dermatologists")
@DiscriminatorValue("DERMATOLOGIST")
@AllArgsConstructor
@NoArgsConstructor
public class Dermatologist extends Employee {
    @ManyToMany(mappedBy = "dermatologists")
    private List<Pharmacy> pharmacies = new ArrayList<Pharmacy>();

    @OneToMany(mappedBy = "dermatologist", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DermatologistComplaint> complaints;

    @OneToMany(mappedBy = "dermatologist", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DermatologistGrade> grades;
}
