package ru.spb.andrey.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ru.spb.andrey.model.partGeneral.GenSimpleIntColumn;
import ru.spb.andrey.model.partGeneral.enumsGen.EnumGenSimpleIntColumn;
import ru.spb.andrey.util.ValidationUtil;

@Repository
public class GenSimpleIntFieldRepository implements AbstractRepository {

    @Autowired
    private CrudRepository crudRepository;

    @Override
    public GenSimpleIntColumn save(GenSimpleIntColumn genSimpleIntColumn) {

        if (!ValidationUtil.isValid(EnumGenSimpleIntColumn.getValuesList(), genSimpleIntColumn.getId())) {
            return null;
        }
        return genSimpleIntColumn;
    }

    public static void main(String[] args) {
        System.out.println(ValidationUtil.isValid(EnumGenSimpleIntColumn.getValuesList(), 1));
    }

}
