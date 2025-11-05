package ru.amfeller.gen.services;

public interface Service<T, DTO,ID> {
    DTO saveOne(DTO dto);
    DTO[] saveMany(DTO[] dtos);
    DTO getOne(ID id);
    DTO[] getAll();
    DTO generateOne();
}
