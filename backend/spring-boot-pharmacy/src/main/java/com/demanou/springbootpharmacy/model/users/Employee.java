package com.demanou.springbootpharmacy.model.users;

import com.demanou.springbootpharmacy.model.medecines.MedecineInquiry;
import com.demanou.springbootpharmacy.model.schedule.WorkDay;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
public class Employee extends User{
    @Column(name = "average_grade")
    private double averageGrade;

    // ***
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<WorkDay> workDays = new ArrayList<WorkDay>();

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<VacationRequest> vacationRequests = new ArrayList<VacationRequest>();

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MedecineInquiry> medicineInquiries;
}
