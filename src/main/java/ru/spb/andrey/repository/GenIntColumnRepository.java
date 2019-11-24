package ru.spb.andrey.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ru.spb.andrey.model.partGeneral.GenIntColumn;

@Repository
public class GenIntColumnRepository implements AbstractRepository {

    @Autowired
    private CrudRepository crudRepository;

    @Override
    public GenIntColumn save(GenIntColumn genIntColumn) {
        return crudRepository.save(genIntColumn);
    }

    public GenIntColumn getById (int id){
        return crudRepository.getById(id);
    }

}
