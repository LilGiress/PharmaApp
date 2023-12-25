package com.demanou.springbootpharmacy.model.users;

import com.demanou.springbootpharmacy.enums.UserCategory;
import com.demanou.springbootpharmacy.model.medecines.EPrescription;
import com.demanou.springbootpharmacy.model.medecines.MedecineReservation;
import com.demanou.springbootpharmacy.model.medecines.Prescription;
import com.demanou.springbootpharmacy.model.pharmacy.Subscription;
import com.demanou.springbootpharmacy.model.schedule.Appointment;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@Table(name="patients")
@DiscriminatorValue("PATIENT")
@AllArgsConstructor
@NoArgsConstructor
public class Patient extends User{
    @Column(name = "points")
    private int points;

    @Column(name = "penalty")
    private int penalty;

    @Column(name = "penalties_reset_date")
    private Date penaltiesResetDate;

    @Column(name = "user_category")
    @Enumerated(EnumType.STRING)
    private UserCategory userCategory;

    @Column(name = "account_activated")
    private boolean accountActivated;

    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Allergy> allergies;

    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Subscription> subscriptions;

    // ***
    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Complaint> complaints = new ArrayList<Complaint>();

    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Prescription> prescriptions;

    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MedecineReservation> medicineReservations;

    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<EPrescription> ePrescriptions;

    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Appointment> appointments;
}
