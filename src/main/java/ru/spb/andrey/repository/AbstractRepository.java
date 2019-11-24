package ru.spb.andrey.repository;

import org.springframework.stereotype.Repository;
import ru.spb.andrey.model.partGeneral.GenIntColumn;

@Repository
public interface AbstractRepository {

    GenIntColumn save(GenIntColumn genIntColumn);

    GenIntColumn getById(int id);

}
