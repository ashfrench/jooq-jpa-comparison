package com.excelian.comparison;

import com.excelian.comparison.db.PersistenceConfiguration;
import com.excelian.comparison.db.jpa.dao.ActorDAO;
import com.excelian.comparison.db.jpa.entities.Actor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.util.List;

@EntityScan(basePackageClasses = { Application.class, Jsr310JpaConverters.class })
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        ActorDAO actorDAO = context.getBean(ActorDAO.class);
        Iterable<Actor> actors = actorDAO.findAll();
        for(Actor actor : actors){
            System.out.println(actor);
        }

        List<Actor> johansson = actorDAO.findByLastName("JOHANSSON");
        System.out.println(johansson);
    }

}
