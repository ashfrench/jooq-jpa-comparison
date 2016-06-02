package com.excelian.comparison.db.jpa.dao;

import com.excelian.comparison.db.jpa.entities.Actor;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ActorDAO extends CrudRepository<Actor, Long>{

    List<Actor> findByLastName(String lastName);
}


