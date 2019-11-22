package ru.spb.andrey.repository;

import org.springframework.stereotype.Repository;
import ru.spb.andrey.model.partGeneral.GenSimpleIntColumn;

@Repository
public interface AbstractRepository {

    GenSimpleIntColumn save(GenSimpleIntColumn genSimpleIntColumn);

    GenSimpleIntColumn getById(int id);

}
