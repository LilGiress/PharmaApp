package com.demanou.springbootpharmacy.dto.medecine;

import com.demanou.springbootpharmacy.enums.EPrescriptionState;
import com.demanou.springbootpharmacy.model.medecines.EPrescriptionItem;
import com.demanou.springbootpharmacy.model.pharmacy.Pharmacy;
import com.demanou.springbootpharmacy.model.users.Patient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EPrescriptionDTO {
    private Long id;


    private String code;


    private Date issuingDate;


    private double price;



    private EPrescriptionState ePrescriptionState;


    private Pharmacy pharmacy;


    private Patient patient;


    private List<EPrescriptionItem> ePrescriptionItems;
}
