package com.cassandra.demo.Repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.cassandra.demo.Models.Personne;

import java.util.UUID;

public interface PersonneRepository extends CassandraRepository<Personne, UUID> {
    // You can define custom queries here if needed
}
