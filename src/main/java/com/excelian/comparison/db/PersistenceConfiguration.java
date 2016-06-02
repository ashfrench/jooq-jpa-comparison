package com.excelian.comparison.db;

import lombok.Data;
import org.jooq.SQLDialect;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
@Data
public class PersistenceConfiguration {

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Bean
    public DefaultDSLContext dslContext(DataSource dataSource){
        DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
        defaultConfiguration.set(SQLDialect.MYSQL);

        TransactionAwareDataSourceProxy transactionAwareDataSourceProxy = new TransactionAwareDataSourceProxy();
        transactionAwareDataSourceProxy.setTargetDataSource(dataSource);

        defaultConfiguration.set(new DataSourceConnectionProvider(transactionAwareDataSourceProxy));

        DefaultDSLContext context = new DefaultDSLContext(defaultConfiguration);
        return context;
    }

}
