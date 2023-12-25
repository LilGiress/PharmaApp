package com.demanou.springbootpharmacy.model.medecines;
import com.demanou.springbootpharmacy.enums.OfferState;
import com.demanou.springbootpharmacy.model.users.Supplier;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Table(name="offers")
@NoArgsConstructor
@AllArgsConstructor
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private Long id;

    @Column(name = "offer_state")
    @Enumerated(EnumType.STRING)
    private OfferState offerState;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "delivery_deadline", nullable = false)
    private Date deliveryDeadline;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Supplier supplier;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private MedecineOrderList medicineOrderList;
}
