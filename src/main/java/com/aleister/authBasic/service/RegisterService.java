package com.aleister.authBasic.service;

import com.aleister.authBasic.dto.model.response.RegisterResponse;

public interface RegisterService {
    Iterable<RegisterResponse> findPersons() ;
    RegisterResponse savePerson(RegisterResponse response);
}
