package com.example.barbershopapi.mapper;

import com.example.barbershopapi.controller.request.SaveClientRequest;
import com.example.barbershopapi.controller.request.UpdateClientRequest;
import com.example.barbershopapi.controller.response.ClientDetailResponse;
import com.example.barbershopapi.controller.response.ListClientResponse;
import com.example.barbershopapi.controller.response.SaveClientResponse;
import com.example.barbershopapi.controller.response.UpdateClientResponse;
import com.example.barbershopapi.entity.ClientEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IClientMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final SaveClientRequest request);

    SaveClientResponse toSaveResponse(final ClientEntity entity);

    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final long id, final UpdateClientRequest request);

    UpdateClientResponse toUpdateResponse(final ClientEntity entity);

    ClientDetailResponse toDetailResponse(final ClientEntity entity);

    List<ListClientResponse> toListResponse(final List<ClientEntity> entities);

}
