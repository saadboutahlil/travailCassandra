package com.cassadra.demo.DTO;

import java.util.List;

import com.cassandra.demo.Models.Adresse;
import com.cassandra.demo.Models.Personne;

public class PersonneAvecAdressesDTO {

    private Personne personne;
    private List<Adresse> adresses;

    public PersonneAvecAdressesDTO(Personne personne, List<Adresse> adresses) {
        this.personne = personne;
        this.adresses = adresses;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public List<Adresse> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<Adresse> adresses) {
        this.adresses = adresses;
    }

    @Override
    public String toString() {
        return "PersonneAvecAdresses{" +
               "personne=" + personne +
               ", adresses=" + adresses +
               '}';
    }
}
