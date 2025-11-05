package ru.amfeller.gen.services;

import ru.amfeller.gen.connectors.Connector;
import ru.amfeller.gen.dto.HumanConverter;
import ru.amfeller.gen.dto.HumanDTO;
import ru.amfeller.gen.entities.Human;

public class HumanService implements Service<Human, HumanDTO, Integer> {
    private Connector<Human, Integer> humanConnector;

    public HumanService(Connector<Human, Integer> humanConnector) {
        this.humanConnector = humanConnector;
    }

    @Override
    public HumanDTO saveOne(HumanDTO dto) {
        Human saved = humanConnector.saveOne(HumanConverter.toEntity(dto));
        return HumanConverter.toDTO(saved);
    }

    @Override
    public HumanDTO[] saveMany(HumanDTO[] dtos) {
        Human[] saved = humanConnector.saveMany(HumanConverter.toEntities(dtos));
        return HumanConverter.toDTOs(saved);
    }

    @Override
    public HumanDTO getOne(Integer id) {
        Human human = humanConnector.getOne(id);
        if (human == null) return null;
        return HumanConverter.toDTO(human);
    }

    @Override
    public HumanDTO[] getAll() {
        return HumanConverter.toDTOs(humanConnector.getAll());
    }

    @Override
    public HumanDTO generateOne() {
        return HumanConverter.toDTO(humanConnector.generateOne());
    }
}
