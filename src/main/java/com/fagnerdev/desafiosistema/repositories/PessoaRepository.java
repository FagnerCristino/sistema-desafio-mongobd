package com.fagnerdev.desafiosistema.repositories;

import com.fagnerdev.desafiosistema.entities.Pessoa;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends MongoRepository<Pessoa, Long> {
}
