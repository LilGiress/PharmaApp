package com.demanou.springbootpharmacy.model.pharmacy;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Table(name="price_lists")
@Data
public class Pricelist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pharmacy_id", referencedColumnName = "id")
    private Pharmacy pharmacy;

    @OneToMany(mappedBy = "pricelist", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MedecinePrice> medicinePrices;

    @OneToMany(mappedBy = "pricelist", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<AppointmentPrice> appointmentPrices;
}
