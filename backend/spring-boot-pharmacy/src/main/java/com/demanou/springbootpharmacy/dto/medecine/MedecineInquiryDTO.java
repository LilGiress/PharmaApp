package com.demanou.springbootpharmacy.dto.medecine;

import com.demanou.springbootpharmacy.model.medecines.Medecine;
import com.demanou.springbootpharmacy.model.pharmacy.Pharmacy;
import com.demanou.springbootpharmacy.model.users.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MedecineInquiryDTO {
    private Long id;

    private Pharmacy pharmacy;

    private Employee employee;

    private Medecine medicine;
    //Aldrice@12345
}
