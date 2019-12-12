package com.chortke.financialAdvisor.dto;

import lombok.Data;

import java.util.List;

/**
 * @Author: Mobina Pak
 * @Date: 12/5/2019
 **/
@Data
public abstract class LegalPartyDto extends InterestedPartyDto {

    protected List<ProductDto> products;
}
