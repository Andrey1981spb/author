package ru.spb.andrey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.spb.andrey.model.partGeneral.GenSimpleIntColumn;

public interface CrudRepository extends JpaRepository<GenSimpleIntColumn, Integer> {

}
