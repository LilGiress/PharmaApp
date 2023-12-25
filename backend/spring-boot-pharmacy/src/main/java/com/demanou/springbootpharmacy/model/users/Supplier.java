package com.demanou.springbootpharmacy.model.users;

import com.demanou.springbootpharmacy.model.medecines.Offer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table(name="suppliers")
@DiscriminatorValue("SUPPLIER")
@AllArgsConstructor
@NoArgsConstructor
public class Supplier extends User{
    @OneToMany(mappedBy = "supplier", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Offer> offers;
}
