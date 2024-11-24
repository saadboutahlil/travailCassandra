package com.cassandra.demo.Repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.cassandra.demo.Models.Adresse;

import java.util.List;
import java.util.UUID;

public interface AdresseRepository extends CassandraRepository<Adresse, UUID> {

    List<Adresse> findByPersonneId(UUID personneId);
    
}