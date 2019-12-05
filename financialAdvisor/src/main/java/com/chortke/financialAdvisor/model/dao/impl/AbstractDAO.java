package com.chortke.financialAdvisor.model.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @Author: Mobina Pak
 * @Date: 5/3/2019
 **/
public class AbstractDAO {

    @PersistenceContext
    EntityManager entityManager;
}
