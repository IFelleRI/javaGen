package ru.amfeller.gen;

import ru.amfeller.gen.connectors.HumanConnector;
import ru.amfeller.gen.dto.HumanDTO;
import ru.amfeller.gen.dto.PassportDTO;
import ru.amfeller.gen.entities.Address;
import ru.amfeller.gen.services.HumanService;

public class Main {
    public static void main(String[] args) {
        HumanService service = new HumanService(new HumanConnector());
        HumanDTO dto = new HumanDTO("Test", new Address("USA", "NY", "Main", "1"), "11.11.2011");
        dto.setPassport(new PassportDTO("P-A", "S-A", "PAT-A", "7111", "809876", "11.11.2011"));
        service.saveOne(dto);
        HumanDTO found = service.getOne(4);
        if (found != null) {
            System.out.println("Найден: " + found.getName());
        }
        HumanDTO[] arr = {
                new HumanDTO("A", new Address("USA", "NY", "A", "1"), "11.11.2011"),
                new HumanDTO("B", new Address("USA", "NY", "A", "1"), "11.11.2011")
        };
        HumanDTO[] arr2 = {
                new HumanDTO("D", new Address("USA", "NY", "A", "1"), "11.11.2011"),
                new HumanDTO("E", new Address("USA", "NY", "A", "1"), "11.11.2011"),
                new HumanDTO("F", new Address("USA", "NY", "A", "1"), "11.11.2011"),
        };
        HumanDTO[] arr3 = {
                new HumanDTO("D", new Address("USA", "NY", "A", "1"), "11.11.2011"),
                new HumanDTO("E", new Address("USA", "NY", "A", "1"), "11.11.2011"),
                new HumanDTO("F", new Address("USA", "NY", "A", "1"), "11.11.2011"),
                new HumanDTO("G", new Address("USA", "NY", "A", "1"), "11.11.2011"),
        };
        service.saveMany(arr);
        service.saveMany(arr2);
        service.saveMany(arr3);
        System.out.println("Всего людей: " + service.getAll().length);
    }
}