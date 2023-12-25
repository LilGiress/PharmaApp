package com.demanou.springbootpharmacy.model.medecines;
import com.demanou.springbootpharmacy.model.pharmacy.Pharmacy;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="pharmacy_medicines")
@Data
public class PharmacyMedicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private Long id;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private Pharmacy pharmacy;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private Medecine medicine;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "deleted")
    private Boolean deleted;
}
