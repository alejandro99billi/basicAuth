package com.aleister.authBasic.controller;

import com.aleister.authBasic.dto.entity.PersonEntity;
import com.aleister.authBasic.exeptions.RecordNotFoundException;
import com.aleister.authBasic.service.RegisterPersonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    RegisterPersonService service;
    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

    @GetMapping("/all")
    @Operation(summary = "Fin all users", tags = {"find-all"},
            responses = {@ApiResponse(responseCode = "400", description = "Context error", content = @Content(mediaType = "application/json"))})
    public ResponseEntity<List<PersonEntity>> getPersons() {
        List<PersonEntity> list = service.getAllPersons();
        logger.info("Estos sonlo usuarios encontrado: {}", list);
        return new ResponseEntity<List<PersonEntity>>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    @Operation(summary = "Find a user for id", tags = {"find"},
            responses = {@ApiResponse(responseCode = "400", description = "Context error", content = @Content(mediaType = "application/json"))})
    public ResponseEntity<PersonEntity> getPersonById(@PathVariable("id") Long id) throws RecordNotFoundException {
        PersonEntity entity = service.getPersonById(id);
        logger.info("se ha encontrado la persona con id: " + id , entity);
        return new ResponseEntity<PersonEntity>(entity, new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping("/create")
    @Operation(summary = "Create or Update a user", tags = {"create"},
            responses = {@ApiResponse(responseCode = "400", description = "Context error", content = @Content(mediaType = "application/json"))})
    public ResponseEntity<PersonEntity> createOrUpdatePerson(@RequestBody PersonEntity entity) {
        PersonEntity update = service.createOrUpdate(entity);
        logger.info("Registrando una nueva persona: {}", entity);
        return new ResponseEntity<PersonEntity>(update, new HttpHeaders(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Delete the user with id", tags = {"delete"},
            responses = {@ApiResponse(responseCode = "400", description = "Context error", content = @Content(mediaType = "application/json"))})
    public HttpStatus deletePersonsById(@PathVariable("id") Long id)
            throws RecordNotFoundException {
        service.deletePerson(id);
        return HttpStatus.FORBIDDEN;
    }
}
