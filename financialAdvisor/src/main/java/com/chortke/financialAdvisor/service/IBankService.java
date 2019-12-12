package com.chortke.financialAdvisor.service;

import com.chortke.financialAdvisor.dto.BankDto;
import com.chortke.financialAdvisor.exception.BaseServerException;

/**
 * @Author: Mobina Pak
 * @Date: 12/12/2019
 **/
public interface IBankService {

    BankDto insert(BankDto bankDto) throws BaseServerException;

    BankDto update(BankDto bankDto) throws BaseServerException;

    BankDto delete(BankDto bankDto) throws BaseServerException;
}
