package com.chortke.financialAdvisor.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Mobina Pak
 * @Date: 14/11/2019
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankDto extends LegalPartyDto {

    private Long id;
    private String name;
    private String nameAbbreviation;
}
