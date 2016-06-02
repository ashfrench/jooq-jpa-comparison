package com.excelian.comparison;

import com.excelian.comparison.db.jooq.dao.JooqDAO;
import com.excelian.comparison.db.jpa.dao.ActorDAO;
import com.excelian.comparison.db.jpa.entities.JpaActor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.util.List;

@EntityScan(basePackageClasses = { Application.class, Jsr310JpaConverters.class })
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        ActorDAO actorDAO = context.getBean(ActorDAO.class);
        Iterable<JpaActor> actors = actorDAO.findAll();
        for(JpaActor jpaActor : actors){
            System.out.println(jpaActor);
        }

        List<JpaActor> johansson = actorDAO.findByLastName("JOHANSSON");
        System.out.println(johansson);

        System.out.println("");
        System.out.println("");


        JooqDAO jooqDAO = context.getBean(JooqDAO.class);
        jooqDAO.doStuff();

        System.out.println("");
        System.out.println("");

        jooqDAO.doJpaStuff();
    }

}
