package com.example.barbershopapi.service;

import com.example.barbershopapi.entity.ScheduleEntity;

public interface IScheduleService {

    ScheduleEntity save(final ScheduleEntity entity);

    void delete(final long id);

}