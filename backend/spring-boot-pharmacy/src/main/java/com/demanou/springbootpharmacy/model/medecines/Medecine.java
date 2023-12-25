package com.demanou.springbootpharmacy.model.medecines;

import com.demanou.springbootpharmacy.enums.MedecineForm;
import com.demanou.springbootpharmacy.enums.MedecineType;
import com.demanou.springbootpharmacy.model.pharmacy.MedecinePrice;
import com.demanou.springbootpharmacy.model.users.Allergy;
import com.demanou.springbootpharmacy.model.users.MedecineGrade;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="medecines")
@AllArgsConstructor
@NoArgsConstructor
public class Medecine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @Column(name = "medicine_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private MedecineType medecineType;

    @Column(name = "medicine_form", nullable = false)
    @Enumerated(EnumType.STRING)
    private MedecineForm medicineForm;

    @Column(name = "on_prescription", nullable = false)
    private boolean onPrescription;

    @Column(name = "points")
    private int points;

    @Column(name = "average_grade")
    private double averageGrade;

    @Column(name = "manufacturer", nullable = false)
    private String manufacturer;

    @Column(name = "additional_information")
    private String additionalInformation;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medicine_specification_id", referencedColumnName = "id")
    private MedecineSpecification medecineSpecification;

    // ***
    @OneToMany(mappedBy = "medicine", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MedecinePrice> medicinePrices;

    @OneToMany(mappedBy = "medicine", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Prescription> prescriptions;

    @OneToMany(mappedBy = "medicine", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

    @OneToMany(mappedBy = "medicine", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MedecineReservation> medecineReservations;

    @OneToMany(mappedBy = "medicine", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<EPrescriptionItem> ePrescriptionItem;

    @ManyToMany(mappedBy = "medicineSubstitutions")
    private List<MedecineSpecification> medecineSpecifications = new ArrayList<MedecineSpecification>();

    @OneToMany(mappedBy = "medicine", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<PharmacyMedicine> pharmacyMedicines;

    @OneToMany(mappedBy = "medicine", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MedecineInquiry> medicineInquiries;

    @OneToMany(mappedBy = "medicine")
    private List<Allergy> allergies;

    @OneToMany(mappedBy = "medicine", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MedecineGrade> grades;

}
