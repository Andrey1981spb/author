package ru.spb.dreamwhite.repository;

import org.springframework.stereotype.Repository;
import ru.spb.dreamwhite.model.User;

import java.util.List;

@Repository
public interface AbstractRepository {

    // null if not found, when updated
    User save(User user);

    // false if not found
    boolean delete(int id);

    // null if not found
    User get(int id);

    // null if not found
    User getByEmail(String email);

    List<User> getAll();

}
