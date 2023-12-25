package com.demanou.springbootpharmacy.model.pharmacy;

import com.demanou.springbootpharmacy.model.medecines.Medecine;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Table(name="medecine_prices")
@AllArgsConstructor
@NoArgsConstructor
public class MedecinePrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private Long id;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "start_time", nullable = false)
    private Date startTime;

    @Column(name = "end_time", nullable = false)
    private Date endTime;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Medecine medicine;

    // ***
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Pricelist pricelist;
}
