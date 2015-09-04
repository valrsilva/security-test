package br.com.vrosendo.securitytest.config;

/**
 * Created by valdeci on 03/09/2015.
 */
public class DataSourceConfig {

    /*@Bean
    public DataSource dataSource() {

        // no need shutdown, EmbeddedDatabaseFactoryBean will take care of this
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        EmbeddedDatabase db = builder
            .setType(EmbeddedDatabaseType.HSQL) //.H2 or .DERBY
            .addScript("db/sql/create-db.sql")
            .addScript("db/sql/insert-data.sql")
            .build();

        return db;

    }*/
}
