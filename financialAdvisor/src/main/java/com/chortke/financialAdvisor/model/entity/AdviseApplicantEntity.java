package com.chortke.financialAdvisor.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @Author: Mobina Pak
 * @Date: 12/5/2019
 **/
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FA_ADVISE_APPLICANT")
public class AdviseApplicantEntity extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "MONTHLY_SALARY")
    private String monthlySalary;

    @Column(name = "SAVED_MONEY")
    private String savedMoney;

    @OneToOne(mappedBy = "applicant", cascade = CascadeType.ALL)
    private AdviseApplicationEntity adviseApplication;

}
