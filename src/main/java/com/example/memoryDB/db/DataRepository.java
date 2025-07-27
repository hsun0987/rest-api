package com.example.memoryDB.db;

import java.util.List;
import java.util.Optional;

public interface DataRepository<T, ID> extends Repository<T,ID> {

    // create, update (기존에 없으면 생성, 있으면 갱신)
    T save(T data);

    // read
    Optional<T> findById(ID id);
    List<T> findAll();

    // delete
    void delete(ID id);


}
