package com.chortke.financialAdvisor.model.entity;

import lombok.Data;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * @Author: Mobina Pak
 * @Date: 12/5/2019
 **/
@MappedSuperclass
@Data
public abstract class LegalPartyEntity extends InterestedPartyEntity {

    @OneToMany(cascade = {CascadeType.ALL}, orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinColumn(name = "LEGAL_PARTY_ID")
    protected List<ProductEntity> products;
}
