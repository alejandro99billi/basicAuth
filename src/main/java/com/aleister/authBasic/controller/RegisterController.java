package com.aleister.authBasic.controller;

import com.aleister.authBasic.dto.model.request.RegisterRequest;
import com.aleister.authBasic.dto.model.response.PersonResponse;
import com.aleister.authBasic.service.RegisterServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegisterController {
    @Autowired
    private RegisterServiceImp service;

    @GetMapping("/all-persons")
    private List<PersonResponse> getPersons(){
        return (List<PersonResponse>) service.findPersons();
    }
    @PostMapping("/register/person")
    private PersonResponse registerPerson(@RequestBody PersonResponse request){
        return service.savePerson(request);
    }
}
