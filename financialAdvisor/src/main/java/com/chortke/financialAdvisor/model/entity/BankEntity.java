package com.chortke.financialAdvisor.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @Author: Mobina Pak
 * @Date: 14/11/2019
 **/
@NamedQueries(
        {
                @NamedQuery(
                        name = "getAllBanks",
                        query = "from BankEntity b "
                ),
                @NamedQuery(
                        name = "findBankByName",
                        query = "from BankEntity b where b.name=:bankName"
                ),

        }
)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FA_BANK")
public class BankEntity extends LegalPartyEntity {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "NAME_ABBREVIATION")
    private String nameAbbreviation;

}
