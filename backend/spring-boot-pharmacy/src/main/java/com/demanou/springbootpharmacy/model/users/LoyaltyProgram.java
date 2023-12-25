package com.demanou.springbootpharmacy.model.users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "loyalty_program")
@AllArgsConstructor
@NoArgsConstructor
public class LoyaltyProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private Long id;

    @Column(name = "min_points")
    private int minPointsLimit;

    @Column(name = "max_points")
    private int maxPointsLimit;

    @Column(name = "silver_points")
    private int silverPointsBorder;

    @Column(name = "gold_points")
    private int goldPointsBorder;

    @Column(name = "silver_discount")
    private int silverCategoryDiscount;

    @Column(name = "gold_discount")
    private int goldCategoryDiscount;

    @Column(name = "examination_points")
    private int pointsPerExaminations;

    @Column(name = "counseling_points")
    private int pointsPerCounseling;
}
