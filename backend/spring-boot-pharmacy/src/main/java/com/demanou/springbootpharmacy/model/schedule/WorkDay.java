package com.demanou.springbootpharmacy.model.schedule;

import com.demanou.springbootpharmacy.model.pharmacy.Pharmacy;
import com.demanou.springbootpharmacy.model.users.Employee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Entity
@Table(name="work_days")
@AllArgsConstructor
@NoArgsConstructor
public class WorkDay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private Long id;

    @Column(name="start_time", nullable=false)
    private Date startTime;

    @Column(name="end_time", nullable=false)
    private Date entTime;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Pharmacy pharmacy;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Employee employee;

    @OneToMany(mappedBy = "workDay", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Appointment> appointments;
}
