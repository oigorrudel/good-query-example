package br.xksoberbado.goodqueryexample.repository;

import br.xksoberbado.goodqueryexample.model.Person;

import java.util.List;

interface PersonQueryRepository { //WITHOUT public AND same package da PersonRepository

    List<Person> findAllByNameLikeAndAgeGreaterThan(String name, Integer age);
}
