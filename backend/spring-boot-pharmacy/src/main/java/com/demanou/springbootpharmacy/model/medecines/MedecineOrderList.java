package com.demanou.springbootpharmacy.model.medecines;

import com.demanou.springbootpharmacy.model.pharmacy.Pharmacy;
import com.demanou.springbootpharmacy.model.users.PharmacyAdministrator;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="medecine_order_lists")
public class MedecineOrderList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private Long id;

    @Column(name = "final_offer_date", nullable = false)
    private Date finalOfferDate;

    @Column(name = "deleted", nullable = false)
    private Boolean deleted;

    @OneToMany(mappedBy = "medicineOrderList", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Pharmacy pharmacy;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private PharmacyAdministrator pharmacyAdministrator;

    // ***
    @OneToMany(mappedBy = "medicineOrderList", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Offer> offers;

}
