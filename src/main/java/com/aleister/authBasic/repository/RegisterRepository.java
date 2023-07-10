package com.aleister.authBasic.repository;

import com.aleister.authBasic.dto.model.response.RegisterResponse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RegisterRepository implements CrudRepository<RegisterResponse, Long> {
    @Override
    public <S extends RegisterResponse> S save(S entity) {
        return null;
    }

    @Override
    public <S extends RegisterResponse> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<RegisterResponse> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<RegisterResponse> findAll() {
        return null;
    }

    @Override
    public Iterable<RegisterResponse> findAllById(Iterable<Long> longs) {
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
    public void delete(RegisterResponse entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends RegisterResponse> entities) {

    }

    @Override
    public void deleteAll() {

    }

}
