package com.demanou.springbootpharmacy.model.medecines;

import com.demanou.springbootpharmacy.model.schedule.AppointmentReport;
import com.demanou.springbootpharmacy.model.users.Patient;
import jakarta.persistence.*;
@Entity
@Table(name="prescriptions")
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private Long id;

    @Column(name = "therapy_day_length", nullable = false)
    private int therapyDayLength;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Medecine medicine;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Patient patient;

    //**
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private AppointmentReport appointmentReport;
}
