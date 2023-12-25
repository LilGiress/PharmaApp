package com.demanou.springbootpharmacy.model.pharmacy;

import com.demanou.springbootpharmacy.model.users.Patient;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Table(name="subscriptions")
@Data
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private Long id;

    @Column(name = "canceled")
    private boolean canceled;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Pharmacy pharmacy;

    @OneToMany(mappedBy = "subscription", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Promotion> promotions;

    // ***
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Patient patient;
}
