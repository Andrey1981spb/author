package ru.spb.andrey.repository;

import ru.spb.andrey.model.partGeneral.GenSimpleIntColumn;

public interface AbstractRepository {

    GenSimpleIntColumn save(GenSimpleIntColumn genSimpleIntColumn);

}
