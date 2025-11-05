package ru.amfeller.gen.services;

import ru.amfeller.gen.connectors.Connector;
import ru.amfeller.gen.converters.PassportConverter;
import ru.amfeller.gen.dto.PassportDTO;
import ru.amfeller.gen.entities.Passport;

public class PassportService implements Service<Passport, PassportDTO, String> {
    Connector<Passport, String> connector;

    public PassportService(Connector<Passport, String> connector) {
        this.connector = connector;
    }

    @Override
    public PassportDTO saveOne(PassportDTO dto) {
        Passport saved = connector.saveOne(PassportConverter.toEntity(dto));
        return PassportConverter.toDTO(saved);
    }

    @Override
    public PassportDTO[] saveMany(PassportDTO[] dtos) {
        Passport[] saved = connector.saveMany(PassportConverter.toEntities(dtos));
        return PassportConverter.toDTOs(saved);
    }

    @Override
    public PassportDTO getOne(String id) {
        Passport passport = connector.getOne(id);
        if (passport == null) return null;
        return PassportConverter.toDTO(passport);
    }

    @Override
    public PassportDTO[] getAll() {
        return PassportConverter.toDTOs(connector.getAll());
    }

    @Override
    public PassportDTO generateOne() {
        return PassportConverter.toDTO(connector.generateOne());
    }
}
