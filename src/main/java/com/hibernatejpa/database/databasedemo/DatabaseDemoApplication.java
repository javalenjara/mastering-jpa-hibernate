package com.hibernatejpa.database.databasedemo;

import com.hibernatejpa.database.databasedemo.dao.PersonJdbcDAO;
import com.hibernatejpa.database.databasedemo.entities.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJdbcDAO dao;

    public static void main(String[] args) {
        SpringApplication.run(DatabaseDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("All users -> {}",  dao.findAll());
        logger.info("User id 1001 -> {}",  dao.findById(1001));
        logger.info("Users named xxxx -> {}",  dao.findByName("%an%"));
        logger.info("Deleting user 1002 -> {}",  dao.deleteById(1002));
        logger.info("Inserting user 1005 -> {}", dao.insert(
                new Person(1005, "Tara", "Berlin", new Date())));
        logger.info("Updating a person -> {}",
                dao.update(new Person(1004, "Jorge", "San Francisco", new Date())));
    }
}
