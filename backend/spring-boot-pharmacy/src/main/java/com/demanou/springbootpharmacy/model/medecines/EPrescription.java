package com.demanou.springbootpharmacy.model.medecines;

import com.demanou.springbootpharmacy.enums.EPrescriptionState;
import com.demanou.springbootpharmacy.model.pharmacy.Pharmacy;
import com.demanou.springbootpharmacy.model.users.Patient;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Entity
@Table(name="e_prescriptions")
@Data
public class EPrescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private Long id;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "issuing_date", nullable = false)
    private Date issuingDate;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "e_prescription_state", nullable = false)
    @Enumerated(EnumType.STRING)
    private EPrescriptionState ePrescriptionState;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Pharmacy pharmacy;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Patient patient;

    @OneToMany(mappedBy = "ePrescription", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<EPrescriptionItem> ePrescriptionItems;
}
