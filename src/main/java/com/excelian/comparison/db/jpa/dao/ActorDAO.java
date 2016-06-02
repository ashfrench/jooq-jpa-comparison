package com.excelian.comparison.db.jpa.dao;

import com.excelian.comparison.db.jpa.entities.JpaActor;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ActorDAO extends CrudRepository<JpaActor, Long>{

    List<JpaActor> findByLastName(String lastName);
}


