package br.xksoberbado.goodqueryexample.runner;

import br.xksoberbado.goodqueryexample.model.Person;
import br.xksoberbado.goodqueryexample.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestRunner implements ApplicationRunner {

    @Autowired
    private PersonRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        repository.saveAll(
            List.of(
                Person.of("João", 40),
                Person.of("Pedro", 15),
                Person.of("Maria", 22),
                Person.of("Arthur", 10),
                Person.of("Joana", 18)
            )
        );

        repository.findAllByNameLikeAndAgeGreaterThan("J%", 17); //João, Joana
        repository.findAllAdultsByName("J%");
    }
}
