package com.example.database.database;

import com.example.database.database.entity.Person;
import com.example.database.database.jdbc.PersonJdbcDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJdbcDAO dao;

    public static void main(String[] args) {
        SpringApplication.run(DatabaseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("All users = {}",
                dao.findAll());

        logger.info("User ID 10001 -> {}",
                dao.findById(10001));

        logger.info("Deleting 10002 -> No of Rows Deleted {}",
                dao.deleteById(10002));

        logger.info("Inserting 10005 -> {}",
                dao.insert(new Person(10005, "Tony", "Warsaw", "25-01-1975")));

        logger.info("Updating 10003 -> {}",
                dao.update(new Person(10003, "Timmy", "Berlin", "25-01-1980")));

    }

}
