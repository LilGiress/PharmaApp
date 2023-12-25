package com.demanou.springbootpharmacy.model.pharmacy;

import com.demanou.springbootpharmacy.model.medecines.*;
import com.demanou.springbootpharmacy.model.schedule.WorkDay;
import com.demanou.springbootpharmacy.model.users.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="pharmacies")
@NoArgsConstructor
@AllArgsConstructor
public class Pharmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "average_grade")
    private double averageGrade;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "latitude")
    private double latitude;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToMany(mappedBy = "pharmacy", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Pharmacist> pharmacists;

    @ManyToMany
    @JoinTable(name = "employee_dermatologists", joinColumns = @JoinColumn(name = "pharmacy_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "dermatologist_id", referencedColumnName = "id"))
    private List<Dermatologist> dermatologists = new ArrayList<Dermatologist>();

    // ***
    @OneToMany(mappedBy = "pharmacy", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<PharmacyAdministrator> pharmacyAdministrators = new ArrayList<PharmacyAdministrator>();

    @OneToMany(mappedBy = "pharmacy", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<WorkDay> workDays = new ArrayList<WorkDay>();

    @OneToMany(mappedBy = "pharmacy", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Subscription> subscriptions;

    @OneToMany(mappedBy = "pharmacy", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MedecineReservation> medicineReservations;

    @OneToMany(mappedBy = "pharmacy", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MedecineOrderList> medicineOrderLists;

    @OneToMany(mappedBy = "pharmacy", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<VacationRequest> vacationRequests = new ArrayList<VacationRequest>();

    @OneToMany(mappedBy = "pharmacy", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<PharmacyComplaint> complaints;

    @OneToMany(mappedBy = "pharmacy", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<PharmacyGrade> grades;

    @OneToMany(mappedBy = "pharmacy", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<PharmacyMedicine> pharmacyMedicines;

    @OneToMany(mappedBy = "pharmacy", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MedecineInquiry> medicineInquiries;

    @OneToMany(mappedBy = "pharmacy", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<EPrescription> ePrescriptions;

    @OneToOne(mappedBy = "pharmacy")
    private Pricelist pricelist;
}
