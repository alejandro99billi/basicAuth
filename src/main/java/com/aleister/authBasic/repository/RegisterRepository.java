package com.aleister.authBasic.repository;

import com.aleister.authBasic.dto.model.response.PersonResponse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RegisterRepository implements CrudRepository<PersonResponse, Long> {
    @Override
    public <S extends PersonResponse> S save(S entity) {
        return null;
    }

    @Override
    public <S extends PersonResponse> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<PersonResponse> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<PersonResponse> findAll() {
        return null;
    }

    @Override
    public Iterable<PersonResponse> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(PersonResponse entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends PersonResponse> entities) {

    }

    @Override
    public void deleteAll() {

    }

}
