package ru.amfeller.gen.dto;

import ru.amfeller.gen.entities.Human;

public class HumanConverter {

    public static Human toEntity(HumanDTO dto) {
        return new Human(
                dto.getName(),
                dto.getAddress(),
                dto.getBirthday()
        );
    }

    public static HumanDTO toDTO(Human entity) {
        if (entity == null) return null;
        return new HumanDTO(
                entity.getName(),
                entity.getAddress(),
                entity.getBirthday()
        );
    }

    public static Human[] toEntities(HumanDTO[] dtos) {
        Human[] result = new Human[dtos.length];
        for (int i = 0; i < dtos.length; i++) {
            result[i] = toEntity(dtos[i]);
        }
        return result;
    }

    public static HumanDTO[] toDTOs(Human[] ents) {
        HumanDTO[] result = new HumanDTO[ents.length];
        for (int i = 0; i < ents.length; i++) {
            result[i] = toDTO(ents[i]);
        }
        return result;
    }
}
