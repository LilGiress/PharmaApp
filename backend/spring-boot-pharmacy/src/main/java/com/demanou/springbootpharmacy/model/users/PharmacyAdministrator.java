package com.demanou.springbootpharmacy.model.users;

import com.demanou.springbootpharmacy.model.medecines.MedecineOrderList;
import com.demanou.springbootpharmacy.model.pharmacy.Pharmacy;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table(name="pharmacy_administrators")
@DiscriminatorValue("PHARMACY_ADMIN")
@AllArgsConstructor
@NoArgsConstructor
public class PharmacyAdministrator extends User{
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Pharmacy pharmacy;

    @OneToMany(mappedBy = "pharmacyAdministrator", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MedecineOrderList> medicineOrderLists;
}
