package com.chortke.financialAdvisor.model.dao;

import com.chortke.financialAdvisor.exception.BaseServerException;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: Mobina Pak
 * @Date: 14/11/2019
 **/
@Transactional(rollbackFor = Exception.class)
public interface GenericDao<T> {

    T insert(T t) throws BaseServerException;

    T update(T t) throws BaseServerException;

    T delete(T t) throws BaseServerException;
}
