package com.excelian.comparison.db.jooq.dao;

import com.excelian.comparison.db.PersistenceConfiguration;
import com.excelian.comparison.db.jpa.entities.JpaActor;
import lombok.Getter;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.types.UShort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

import static com.excelian.comparison.db.jooq.entities.tables.Actor.ACTOR;


@Component
public class JooqDAO {

    @Autowired
    private PersistenceConfiguration persistenceConfiguration;

    @PersistenceContext
    private EntityManager entityManager;

    @Getter
    @Autowired
    private DSLContext dslContext;

    public void doStuff(){
        Result<Record> records = dslContext.select().from(ACTOR).fetch();



        for (Record record : records) {
            String firstName = record.getValue(ACTOR.FIRST_NAME);
            String lastName = record.getValue(ACTOR.LAST_NAME);
            UShort id = record.getValue(ACTOR.ACTOR_ID);

            System.out.println("ID: " + id + " firstname: " + firstName + " lastname: " + lastName);
        }
    }

    public <E> List<E> getJpaObjects(org.jooq.Query query, Class<E> type) {
        return nativeQuery(query, type);
    }

    public void doJpaStuff(){
        org.jooq.Query query = dslContext.select().from(ACTOR);

        List<JpaActor> jpaActors = nativeQuery(query, JpaActor.class);

        for (JpaActor jpaActor : jpaActors) {
            System.out.println(jpaActor);
        }
    }

    private <E> List<E> nativeQuery(org.jooq.Query query, Class<E> type) {
        // Extract the SQL statement from the jOOQ query:
        Query result = entityManager.createNativeQuery(query.getSQL(), type);

        // Extract the bind values from the jOOQ query:
        List<Object> values = query.getBindValues();
        for (int i = 0; i < values.size(); i++) {
            result.setParameter(i + 1, values.get(i));
        }

        // There's an unsafe cast here, but we can be sure that we'll get the right type from JPA
        return result.getResultList();
    }
}
