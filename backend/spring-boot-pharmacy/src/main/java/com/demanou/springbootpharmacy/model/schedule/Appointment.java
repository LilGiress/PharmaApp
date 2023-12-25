package com.demanou.springbootpharmacy.model.schedule;

import com.demanou.springbootpharmacy.enums.AppointmentState;
import com.demanou.springbootpharmacy.enums.AppointmentType;
import com.demanou.springbootpharmacy.model.users.Patient;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Table(name="appointments")
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private Long id;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "appointment_state", nullable = false)
    @Enumerated(EnumType.STRING)
    private AppointmentState appointmentState;

    @Column(name = "appointment_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private AppointmentType appointmentType;

    @Column(name = "start_time", nullable = false)
    private Date startTime;

    @Column(name = "end_time", nullable = false)
    private Date endTime;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Patient patient;

    @Column(name = "got_penalty", nullable = false)
    private boolean gotPenalty;

    // ***
    @OneToOne(mappedBy = "appointment")
    private AppointmentReport appointmentReport;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private WorkDay workDay;
}
