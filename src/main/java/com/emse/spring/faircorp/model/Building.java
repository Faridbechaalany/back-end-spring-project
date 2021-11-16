package com.emse.spring.faircorp.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "RBUILDING")

public class Building {

    @Id
    @GeneratedValue
    private  Long id;

    @Column(nullable=true)
    private Double outside_temperature;

    @OneToMany(mappedBy = "building")
    private Set<Room> rooms;

    public Building() {
    }

    public Building(Double outside_temperature) {
        this.outside_temperature = outside_temperature;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getOutside_temperature() {
        return outside_temperature;
    }

    public void setOutside_temperature(Double outside_temperature) {
        this.outside_temperature = outside_temperature;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }
}
