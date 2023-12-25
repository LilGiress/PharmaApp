package com.demanou.springbootpharmacy.model.medecines;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="e_prescription_items")
@Data
public class EPrescriptionItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private Long id;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Medecine medicine;

    // ***
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private EPrescription ePrescription;
}
