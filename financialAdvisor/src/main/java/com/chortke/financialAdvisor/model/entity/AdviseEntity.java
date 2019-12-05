package com.chortke.financialAdvisor.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @Author: Mobina Pak
 * @Date: 14/11/2019
 **/
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FA_ADVISE")
public class AdviseEntity extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "RATE")
    private Short rate;

    @ManyToOne
    @JoinColumn(name = "ADVISE_APPLICATION_ID")
    private AdviseApplicationEntity adviseApplication;

}
