package com.fagnerdev.desafiosistema.services;


import com.fagnerdev.desafiosistema.entities.Pessoa;
import com.fagnerdev.desafiosistema.exceptions.ControllerNotFoundException;
import com.fagnerdev.desafiosistema.exceptions.DataBaseException;
import com.fagnerdev.desafiosistema.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public Pessoa findById(Long id){
        Optional<Pessoa> obj = repository.findById(id);
        return obj.orElseThrow(()-> new ControllerNotFoundException(id));
    }

    public List<Pessoa> findAll(){
        return repository.findAll();
    }

    public Pessoa save(Pessoa obj) {
        return repository.save(obj);
    }

    public void delete(Long id){
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ControllerNotFoundException(id);
        } catch (DataIntegrityViolationException e) {
            throw new DataBaseException(e.getMessage());
        }
    }


}
