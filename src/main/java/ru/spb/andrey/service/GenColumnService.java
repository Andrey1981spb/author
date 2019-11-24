package ru.spb.andrey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import ru.spb.andrey.model.partGeneral.GenIntColumn;
import ru.spb.andrey.repository.GenIntColumnRepository;

import static ru.spb.andrey.util.ValidationUtil.checkNotFoundWithId;

@Service
public class GenColumnService {

    @Autowired
    GenIntColumnRepository genIntColumnRepository;

    public void update(GenIntColumn genIntColumn) {
        Assert.notNull(genIntColumn, "column must not be null");
        checkNotFoundWithId(genIntColumnRepository.save(genIntColumn), genIntColumn.getId());
    }

    public GenIntColumn create(GenIntColumn genIntColumn) {
        Assert.notNull(genIntColumn, "column must not be null");
        return genIntColumnRepository.save(genIntColumn);
    }

    public GenIntColumn getById (int id){
        return genIntColumnRepository.getById(id);
    }

}
