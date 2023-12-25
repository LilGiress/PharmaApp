package com.demanou.springbootpharmacy.dto.medecine;

import com.demanou.springbootpharmacy.model.medecines.EPrescription;
import com.demanou.springbootpharmacy.model.medecines.Medecine;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EPrescriptionItemDTO {
    private Long id;


    private int quantity;


    private Medecine medicine;

    private EPrescription ePrescription;
}
