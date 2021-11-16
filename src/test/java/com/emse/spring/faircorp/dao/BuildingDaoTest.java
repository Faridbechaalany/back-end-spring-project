package com.emse.spring.faircorp.dao;


import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.Window;
import com.emse.spring.faircorp.model.WindowStatus;
import org.assertj.core.api.Assertions;
import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.stream.Collectors;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class BuildingDaoTest {

    @Autowired
    private  BuildingDao buildingDao;
    private  HeaterDao heaterDao;

    @Test
    public void shouldFindBuildingWindows() {
        List<Window> result = buildingDao.findWindowsByBuilding(-3L);
        Assertions.assertThat(result)
                .hasSize(3);
    }

    @Test
    public void shouldFindBuildingHeaters() {
        List<Heater> result = buildingDao.findHeatersByBuilding(-3L);
        Assertions.assertThat(result)
                .hasSize(3);
    }

}