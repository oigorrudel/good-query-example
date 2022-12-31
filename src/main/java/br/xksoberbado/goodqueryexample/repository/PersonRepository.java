package br.xksoberbado.goodqueryexample.repository;

import br.xksoberbado.goodqueryexample.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long>, PersonQueryRepository {

    default List<Person> findAllAdultsByName(String name) {
        return findAllByNameLikeAndAgeGreaterThan(name, 17);
    }
}
