package com.aleister.authBasic.service;

import com.aleister.authBasic.dto.model.response.RegisterResponse;
import com.aleister.authBasic.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Alejandro Salvatierra
 */

@Service
public class RegisterServiceImp implements RegisterService {

    @Autowired
    private RegisterRepository repository;

    @Override
    public Iterable<RegisterResponse> findPersons() {
        return repository.findAll();
    }

    @Override
    public RegisterResponse savePerson(RegisterResponse response) {
        return repository.save(response);
    }


}
