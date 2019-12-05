package com.chortke.financialAdvisor.model.dao;

import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: Mobina Pak
 * @Date: 14/11/2019
 **/
@Transactional(rollbackFor = Exception.class)
public interface GenericDao<E> {
}
