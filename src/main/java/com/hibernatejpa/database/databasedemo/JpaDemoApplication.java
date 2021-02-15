package com.hibernatejpa.database.databasedemo;

import com.hibernatejpa.database.databasedemo.entities.Person;
import com.hibernatejpa.database.databasedemo.jparepository.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJpaRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("User id 1001 -> {}",  repository.findById(1001));
        logger.info("Inserting user -> {}", repository.insert(
                new Person("Tara", "Berlin", new Date())));
        logger.info("Updating a person -> {}",
                repository.update(new Person(1004, "Jorge", "San Francisco", new Date())));

        repository.deleteById(1002);

        logger.info("All users -> {}",  repository.findAll());
        
    }
}
