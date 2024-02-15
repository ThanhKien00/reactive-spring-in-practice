package com.example.reactive.repository.impl;

import com.example.reactive.domain.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

class PersonRepositoryImplTest {

    PersonRepositoryImpl personRepository;

    @BeforeEach
    void setUp() {
        personRepository = new PersonRepositoryImpl();
    }

    @Test
    void getByIdBlock() {
        Person person = personRepository.getById(1).block();
        assert person != null;
        System.out.println(person);
    }

    @Test
    void getByIdSubscribe() {
        Mono<Person> personMono = personRepository.getById(1);
        personMono.subscribe(System.out::println);
    }

    @Test
    void getIdMapFunction() {
        personRepository.getById(1)
                .map(Person::getFirstname)
                .subscribe(System.out::println);
    }

    @Test
    void testFluxBlockFirst() {
        Person person = personRepository.findAll()
                .blockFirst();
        System.out.println(person);
    }

    @Test
    void testFluxSubscribe() {
        personRepository.findAll()
                .subscribe(System.out::println);
    }

    @Test
    void testFluxToListMono() {
        personRepository.findAll()
                .collectList()
                .subscribe(list -> list.forEach(System.out::println));
    }

    @Test
    void testFindPersonById() {
        final Integer id = 3;
        personRepository.findAll()
                .filter(person -> person.getId().equals(id))
                .next()
                .subscribe(System.out::println);
    }


}