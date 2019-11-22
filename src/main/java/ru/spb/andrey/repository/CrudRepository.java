package ru.spb.andrey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.spb.andrey.model.partGeneral.GenSimpleIntColumn;

@Repository
public interface CrudRepository extends JpaRepository<GenSimpleIntColumn, Integer> {

    GenSimpleIntColumn getById (int id);

}
