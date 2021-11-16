package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Building;
import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.Window;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface BuildingDaoCustom
{
      @Transactional
      @Modifying
      @Query("select w from Window w where w.room.id in (select r.id from Room r where r.building.id = :id)")
      List<Window> findWindowsByBuilding(@Param("id") Long id);
      @Query("select h from Heater h where h.room.id in (select r.id from Room r where r.building.id = :id)")
      List<Heater> findHeatersByBuilding(@Param("id") Long id);
}
