package ru.spb.andrey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import ru.spb.andrey.model.partGeneral.GenSimpleIntColumn;
import ru.spb.andrey.repository.GenSimpleIntFieldRepository;

import static ru.spb.andrey.util.ValidationUtil.checkNotFoundWithId;

@Service
public class GenSimpleFieldService {

    @Autowired
    GenSimpleIntFieldRepository genSimpleIntFieldRepository;

    public void update(GenSimpleIntColumn genSimpleIntColumn) {
        Assert.notNull(genSimpleIntColumn, "column must not be null");
        checkNotFoundWithId(genSimpleIntFieldRepository.save(genSimpleIntColumn), genSimpleIntColumn.getId());
    }

    public GenSimpleIntColumn create(GenSimpleIntColumn genSimpleIntColumn) {
        Assert.notNull(genSimpleIntColumn, "column must not be null");
        return genSimpleIntFieldRepository.save(genSimpleIntColumn);
    }

    public GenSimpleIntColumn getById (int id){
        return genSimpleIntFieldRepository.getById(id);
    }

}
