package ru.amfeller.gen.connectors;

import ru.amfeller.gen.DataBase;
import ru.amfeller.gen.entities.Address;
import ru.amfeller.gen.entities.Human;

import java.util.Random;

public class HumanConnector implements Connector<Human,Integer> {
    DataBase<Human> database = new DataBase<>();
    int idCounter = 1;

    @Override
    public Human saveOne(Human entity) {
        entity.id = idCounter++;
        if (database.storage == null) {
            database.storage = new Human[]{entity};
            return entity;
        }
        Human[] tmpArr = new Human[database.storage.length + 1];
        for (int i = 0; i < database.storage.length; i++) {
            tmpArr[i] = database.storage[i];
        }
        tmpArr[tmpArr.length - 1] = entity;
        database.storage = tmpArr;
        return entity;
    }

    @Override
    public Human[] saveMany(Human[] entities) {
        for (Human entity : entities) {
            saveOne(entity);
        }
        return entities;
    }

    @Override
    public Human getOne(Integer id) {
        for (Human human : database.storage) {
            if (human.id.equals(id)) {
                return human;
            }
        }
        return null;
    }

    @Override
    public Human[] getAll() {
        return database.storage;
    }

    @Override
    public Human generateOne() {
        Random r = new Random();
        String[] names = {"Alex", "John", "Maria"};
        String[] countries = {"USA", "Germany"};
        String[] cities = {"NY", "Berlin"};
        String[] streets = {"Main", "First"};
        return new Human(
                names[r.nextInt(names.length)],
                new Address(
                        countries[r.nextInt(countries.length)],
                        cities[r.nextInt(cities.length)],
                        streets[r.nextInt(streets.length)],
                        "10"
                ),
                "19.09.2011"
        );
    }
}
