package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Heater;
import org.springframework.data.jpa.repository.Modifying;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

class HeaterDaoCustomimpl implements HeaterDaoCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void deleteByRoom(Long id) {

    }
}
