package com.aleister.authBasic.controller;

import com.aleister.authBasic.dto.model.request.RegisterRequest;
import com.aleister.authBasic.dto.model.response.PersonResponse;
import com.aleister.authBasic.service.RegisterServiceImp;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name="Register")
public class RegisterController {
    @Autowired
    private RegisterServiceImp service;
    private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);

    @GetMapping("/all-persons")
    private List<PersonResponse> getPersons(){

        return (List<PersonResponse>) service.findPersons();
    }
    //TODO ADD A NEW CLASS FOR MANAGER THE ERROR AND USE THIS ANNOTATION schema=@Schema (implementation = ErrorVM.class)
    @PostMapping("/register/person")
   @Operation(summary = "Register the user", tags = {"Register"},
   responses = {@ApiResponse(responseCode = "400",description="Context error",content = @Content(mediaType = "application/json"))})
    private PersonResponse registerPersonWithCredentials (@RequestBody PersonResponse request){
        logger.info("Registrando una nueva persona: {}", request);
        return service.savePerson(request);

    }
}

