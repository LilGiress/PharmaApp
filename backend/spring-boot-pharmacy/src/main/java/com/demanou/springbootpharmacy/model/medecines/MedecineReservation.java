package com.demanou.springbootpharmacy.model.medecines;

import com.demanou.springbootpharmacy.enums.MedecineReservationState;
import com.demanou.springbootpharmacy.model.pharmacy.Pharmacy;
import com.demanou.springbootpharmacy.model.users.Patient;
import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="medecine_reservations")
public class MedecineReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private Long id;

    @Column(name = "final_purchasing_date", nullable = false)
    private Date finalPurchasingDate;

    @Column(name = "medicine_reservation_state")
    MedecineReservationState medicineReservationState;

    @Column(name = "got_penalty", nullable = false)
    private boolean gotPenalty;

    @Column(name = "unique_reservation_code", nullable = false)
    private String uniqueReservationCode;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Medecine medicine;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Pharmacy pharmacy;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Patient patient;

}
