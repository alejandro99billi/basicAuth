package com.aleister.authBasic.service;

import com.aleister.authBasic.dto.model.response.PersonResponse;

public interface RegisterService {
    Iterable<PersonResponse> findPersons() ;
    PersonResponse savePerson(PersonResponse response);
}
