package com.cassandra.demo;

import java.net.InetSocketAddress;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.datastax.oss.driver.api.core.CqlSession;

@Configuration
public class CassandraConfig {

    @Bean
    public CqlSession cassandraSession() {
        return CqlSession.builder()
                         .addContactPoint(new InetSocketAddress("127.0.0.1", 9042))
                         .withLocalDatacenter("datacenter1")
                         .withKeyspace("my_keyspace")
                         .build();
    }
}
