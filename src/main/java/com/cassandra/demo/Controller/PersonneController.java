package com.cassandra.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cassadra.demo.DTO.PersonneAvecAdressesDTO;
import com.cassandra.demo.Models.Personne;
import com.cassandra.demo.Service.PersonneService;

import java.util.UUID;

@RestController
@RequestMapping("/personne")
public class PersonneController {

    @Autowired
    private PersonneService personneService;

    @PostMapping
    public Personne addPersonne(@RequestBody Personne personne) {
        return personneService.savePersonne(personne);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Personne> getPersonneById(@PathVariable UUID id) {
        Personne personne = personneService.getPersonneById(id);
        if (personne == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(personne);
    }
    
    @GetMapping("/personnes/{id}")
    public ResponseEntity<PersonneAvecAdressesDTO> getPersonneAvecAdresses(@PathVariable UUID id) {
    	PersonneAvecAdressesDTO personneAvecAdresses = personneService.getPersonneAvecAdresses(id);
        if (personneAvecAdresses == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(personneAvecAdresses);
    }


}