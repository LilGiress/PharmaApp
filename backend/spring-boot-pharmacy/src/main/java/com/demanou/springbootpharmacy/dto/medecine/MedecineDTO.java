package com.demanou.springbootpharmacy.dto.medecine;

import com.demanou.springbootpharmacy.enums.MedecineForm;
import com.demanou.springbootpharmacy.enums.MedecineType;
import com.demanou.springbootpharmacy.model.medecines.*;
import com.demanou.springbootpharmacy.model.pharmacy.MedecinePrice;
import com.demanou.springbootpharmacy.model.users.Allergy;
import com.demanou.springbootpharmacy.model.users.MedecineGrade;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MedecineDTO {
    private Long id;

    private String name;

    private String code;

    private MedecineType medecineType;

    private MedecineForm medicineForm;

    private boolean onPrescription;

    private int points;

    private double averageGrade;

    private String manufacturer;

    private String additionalInformation;

    private MedecineSpecification medecineSpecification;

    private List<MedecinePrice> medicinePrices;

    private List<Prescription> prescriptions;

    private List<OrderItem> orderItems;

    private List<MedecineReservation> medecineReservations;

    private List<EPrescriptionItem> ePrescriptionItem;

    private List<MedecineSpecification> medecineSpecifications = new ArrayList<MedecineSpecification>();

    private List<PharmacyMedicine> pharmacyMedicines;

    private List<MedecineInquiry> medicineInquiries;

    private List<Allergy> allergies;

    private List<MedecineGrade> grades;
}
