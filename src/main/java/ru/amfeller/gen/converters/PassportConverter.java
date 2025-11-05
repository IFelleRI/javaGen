package ru.amfeller.gen.converters;

import ru.amfeller.gen.dto.PassportDTO;
import ru.amfeller.gen.entities.Passport;

public class PassportConverter {
    public static Passport toEntity(PassportDTO dto) {
        return new Passport(
                dto.getName(),
                dto.getSurname(),
                dto.getPatronymic(),
                dto.getSeries(),
                dto.getNumber(),
                dto.getDate()
        );
    }


    public static PassportDTO toDTO(Passport entity) {
        return new PassportDTO(
                entity.getName(),
                entity.getSurname(),
                entity.getPatronymic(),
                entity.getSeries(),
                entity.getNumber(),
                entity.getDate()
        );
    }


    public static Passport[] toEntities(PassportDTO[] dtos) {
        Passport[] res = new Passport[dtos.length];
        for (int i = 0; i < dtos.length; i++) res[i] = toEntity(dtos[i]);
        return res;
    }


    public static PassportDTO[] toDTOs(Passport[] ents) {
        PassportDTO[] res = new PassportDTO[ents.length];
        for (int i = 0; i < ents.length; i++) res[i] = toDTO(ents[i]);
        return res;
    }
}
