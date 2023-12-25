package com.demanou.springbootpharmacy.dto.medecine;

import com.demanou.springbootpharmacy.model.medecines.MedecineSpecification;
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
public class IngredientDTO {
    private Long id;

    private String name;

    private List<MedecineSpecification> medecineSpecification = new ArrayList<MedecineSpecification>();
}
