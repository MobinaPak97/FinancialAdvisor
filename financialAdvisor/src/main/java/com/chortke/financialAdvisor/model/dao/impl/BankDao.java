package com.chortke.financialAdvisor.model.dao.impl;

import com.chortke.financialAdvisor.exception.BaseServerException;
import com.chortke.financialAdvisor.model.dao.IBankDao;
import com.chortke.financialAdvisor.model.entity.BankEntity;
import org.springframework.stereotype.Repository;

/**
 * @Author: Mobina Pak
 * @Date: 12/12/2019
 **/
@Repository
public class BankDao extends AbstractDAO implements IBankDao {

    @Override
    public BankEntity insert(BankEntity bankEntity) throws BaseServerException {
        try {
            entityManager.persist(bankEntity);
            return bankEntity;
        } catch (Exception e) {
            throw new BaseServerException("Problems found!", e);
        }
    }

    @Override
    public BankEntity update(BankEntity bankEntity) throws BaseServerException {
        try {
            entityManager.merge(bankEntity);
            return bankEntity;
        } catch (Exception e) {
            throw new BaseServerException("Problems found!", e);
        }
    }

    @Override
    public BankEntity delete(BankEntity bankEntity) throws BaseServerException {
        try {
            entityManager.remove(bankEntity);
            return bankEntity;
        } catch (Exception e) {
            throw new BaseServerException("Problems found!", e);
        }
    }
}
