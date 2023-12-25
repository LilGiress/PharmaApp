package com.demanou.springbootpharmacy.model.schedule;

import com.demanou.springbootpharmacy.model.medecines.Prescription;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table(name="appointment_reports")
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private Long id;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "appointment_id", referencedColumnName = "id")
    private Appointment appointment;

    @OneToMany(mappedBy = "appointmentReport", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Prescription> prescriptions;
}
