package ru.amfeller.gen.connectors;

import ru.amfeller.gen.DataBase;
import ru.amfeller.gen.entities.Passport;

import java.util.Random;

public class PassportConnector implements Connector<Passport,String> {
    DataBase<Passport> database = new DataBase<>();
    int idCounter = 1;

    @Override
    public Passport saveOne(Passport entity) {
        entity.id = "P_"+idCounter++;
        if (database.storage == null) {
            database.storage = new Passport[]{entity};
            return entity;
        }
        Passport[] tmpArr = new Passport[database.storage.length + 1];
        for (int i = 0; i < database.storage.length; i++) {
            tmpArr[i] = database.storage[i];
        }
        tmpArr[tmpArr.length - 1] = entity;
        database.storage = tmpArr;
        return entity;
    }

    @Override
    public Passport[] saveMany(Passport[] entities) {
        for (Passport entity : entities) {
            saveOne(entity);
        }
        return entities;
    }

    @Override
    public Passport getOne(String id) {
        for (Passport passport : database.storage) {
            if (passport.id.equals(id)) {
                return passport;
            }
        }
        return null;
    }

    @Override
    public Passport[] getAll() {
        return database.storage;
    }

    @Override
    public Passport generateOne() {
        Random r = new Random();
        String[] surnames = {"Ivanov", "Petrov", "Sidorov"};
        String[] names = {"Ivan", "Petr", "Sidr"};
        return new Passport(
                surnames[r.nextInt(surnames.length)],
                names[r.nextInt(names.length)],
                "Olegovich",
                "1234",
                String.valueOf(100000 + r.nextInt(900000)),
                "11.11.2011"
        );
    }
}
