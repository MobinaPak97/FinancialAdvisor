package com.chortke.financialAdvisor.service.impl;

import com.chortke.financialAdvisor.dto.BankDto;
import com.chortke.financialAdvisor.exception.BaseServerException;
import com.chortke.financialAdvisor.model.dao.IBankDao;
import com.chortke.financialAdvisor.model.entity.BankEntity;
import com.chortke.financialAdvisor.service.IBankService;
import com.chortke.financialAdvisor.service.utils.mapper.MapperClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Mobina Pak
 * @Date: 12/12/2019
 **/
@Service
public class BankService implements IBankService {

    @Autowired
    private IBankDao bankDao;

    @Override
    public BankDto insert(BankDto bankDto) throws BaseServerException {
        BankEntity bankEntity = MapperClass.mapper(new BankEntity(),bankDto);
        bankDao.insert(bankEntity);
        return bankDto;
    }

    @Override
    public BankDto update(BankDto bankDto) throws BaseServerException {
        return null;
    }

    @Override
    public BankDto delete(BankDto bankDto) throws BaseServerException {
        BankEntity bankEntity = MapperClass.mapper(new BankEntity(),bankDto);
        bankDao.delete(bankEntity);
        return bankDto;
    }
}
