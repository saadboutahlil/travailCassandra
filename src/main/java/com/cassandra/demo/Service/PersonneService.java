package com.cassandra.demo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cassandra.demo.DTO.PersonneAvecAdressesDTO;
import com.cassandra.demo.Models.Adresse;
import com.cassandra.demo.Models.Personne;
import com.cassandra.demo.Repository.AdresseRepository;
import com.cassandra.demo.Repository.PersonneRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class PersonneService {

    @Autowired
    private PersonneRepository personneRepository;
    @Autowired
    private AdresseRepository adresseRepository;
    
    public Personne getPersonneById(UUID id) {
        if (id == null) {
            return null;
        }
        Optional<Personne> personne = personneRepository.findById(id);
        return personne.orElse(null);
    }
    public Personne savePersonne(Personne personne) {
        return personneRepository.save(personne);
    }
    public PersonneAvecAdressesDTO getPersonneAvecAdresses(UUID id) {
        Optional<Personne> personneOpt = personneRepository.findById(id);
        if (!personneOpt.isPresent()) {
            return null;  // Si la personne n'est pas trouvée
        }

        Personne personne = personneOpt.get();
        List<Adresse> adresses = adresseRepository.findByPersonneId(id);

        return new PersonneAvecAdressesDTO(personne, adresses);
    }
}