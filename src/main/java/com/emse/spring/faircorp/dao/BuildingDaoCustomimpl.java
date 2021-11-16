package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Building;
import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.Room;
import com.emse.spring.faircorp.model.Window;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

class BuildingDaoCustomimpl implements BuildingDaoCustom{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Window> findWindowsByBuilding(Long id) {
        return  null;
    }

    @Override
    public List<Heater> findHeatersByBuilding(Long id) {
        return null;
    }
}
