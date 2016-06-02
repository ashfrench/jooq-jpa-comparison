package com.excelian.comparison;

import org.jooq.util.GenerationTool;
import org.jooq.util.jaxb.*;

public class JooqGenerator {

    public static void main(String args[]) throws Exception {
        Configuration configuration = new Configuration()
                .withJdbc(new Jdbc()
                        .withDriver("com.mysql.cj.jdbc.Driver")
                        .withUrl("jdbc:mysql://localhost:3306/sakila?useSSL=false")
                        .withUser("root")
                        .withPassword("Password"))
                .withGenerator(new Generator()
                        .withDatabase(new Database()
                                .withName("org.jooq.util.mysql.MySQLDatabase")
                                .withIncludes(".*")
                                .withExcludes("")
                                .withInputSchema("sakila"))
                        .withTarget(new Target()
                                .withPackageName("com.excelian.comparison.db.jooq.entities")
                                .withDirectory("src/main/java/")));

        GenerationTool.generate(configuration);
    }
}
