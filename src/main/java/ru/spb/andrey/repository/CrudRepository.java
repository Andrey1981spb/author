package ru.spb.andrey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.spb.andrey.model.partGeneral.GenIntColumn;

@Repository
@Transactional (readOnly = true)
public interface CrudRepository extends JpaRepository<GenIntColumn, Integer> {

    GenIntColumn getById (int id);

}
