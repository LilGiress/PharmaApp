package com.demanou.springbootpharmacy.model.users;

import com.demanou.springbootpharmacy.model.pharmacy.Pharmacy;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table(name="pharmacists")
@DiscriminatorValue("PHARMACIST")
@AllArgsConstructor
@NoArgsConstructor
public class Pharmacist extends Employee {
    @Column(name = "deleted")
    private Boolean deleted;

    // ***
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Pharmacy pharmacy;

    @OneToMany(mappedBy = "pharmacist", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<PharmacistComplaint> complaints;

    @OneToMany(mappedBy = "pharmacist", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<PharmacistGrade> grades;
}
