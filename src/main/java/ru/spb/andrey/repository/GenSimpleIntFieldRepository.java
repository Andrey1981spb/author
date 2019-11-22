package ru.spb.andrey.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;
import ru.spb.andrey.model.partGeneral.GenSimpleIntColumn;

@Repository
@Transactional(readOnly = true)
public class GenSimpleIntFieldRepository implements AbstractRepository {

    @Autowired
    private CrudRepository crudRepository;

    @Override
    @Transactional
    public GenSimpleIntColumn save(GenSimpleIntColumn genSimpleIntColumn) {
        crudRepository.save(genSimpleIntColumn);
        return genSimpleIntColumn;
    }

    public GenSimpleIntColumn getById (int id){
        return crudRepository.getById(id);
    }

}
