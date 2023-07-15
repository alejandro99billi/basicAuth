package com.aleister.authBasic.service;

import com.aleister.authBasic.dto.entity.PersonEntity;
import com.aleister.authBasic.exeptions.RecordNotFoundException;
import com.aleister.authBasic.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RegisterPersonService {
    @Autowired
    PersonRepository personRepository;

    public List<PersonEntity> getAllPersons(){
        List<PersonEntity> persons = personRepository.findAll();
        if(persons.size() > 0){
            return persons;
        }
        else return new ArrayList<PersonEntity>();
    }

    public PersonEntity getPersonById(long id) throws RecordNotFoundException {
        Optional<PersonEntity> person = personRepository.findById(id);
        if(person.isPresent()){
            return person.get();
        }
        else{
            throw new RecordNotFoundException("no se encuentra a esta persona");
        }
    }

    public PersonEntity createOrUpdate(PersonEntity entity) {
        if (entity.getId() == null) {
            // Crear una nueva persona sin ID
            entity = personRepository.save(entity);
            return entity;
        } else {
            Optional<PersonEntity> person = personRepository.findById(entity.getId());
            if (person.isPresent()) {
                PersonEntity existingPerson = person.get();
                existingPerson.setName(entity.getName());
                existingPerson.setLastName(entity.getLastName());
                existingPerson = personRepository.save(existingPerson);
                return existingPerson;
            }
        }
        throw new IllegalArgumentException("Invalid operation: Unable to create or update the person.");
    }

    public void deletePerson(Long id) throws RecordNotFoundException{
        Optional<PersonEntity> person = personRepository.findById(id);
        if(person.isPresent()){
            personRepository.deleteById(id);
        }else {
            throw new RecordNotFoundException("no existe persona con ese id");
        }

    }

}
