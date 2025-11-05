package ru.amfeller.gen.connectors;

public interface Connector<T,ID> {
    T saveOne(T entity);
    T[] saveMany(T[] entities);
    T getOne(ID id);
    T[] getAll();
    T generateOne();
}
