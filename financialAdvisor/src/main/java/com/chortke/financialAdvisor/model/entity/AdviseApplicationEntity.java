package com.chortke.financialAdvisor.model.entity;

import com.chortke.financialAdvisor.enums.AdviseType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

/**
 * @Author: Mobina Pak
 * @Date: 14/11/2019
 **/
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="FA_ADVISE_APPLICATION")
public class AdviseApplicationEntity extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "ADVISE_TYPE")
    @Enumerated(EnumType.STRING)
    private AdviseType adviseType;

    @OneToOne(cascade = {CascadeType.ALL} , orphanRemoval = true)
    private AdviseApplicantEntity applicant;

    @OneToMany(cascade = {CascadeType.ALL}, orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinColumn(name = "ADVISE_APPLICATION_ID")
    private List<AdviseEntity> adviseList;

}
