package com.aniketapte.cmdlineapp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication // annotate this class as a spring boot app
public class Main implements ApplicationRunner { // this class is a command line app
    private static Logger logger = LoggerFactory.getLogger( Main.class );

    public static void main(String[] args) {
        SpringApplication.run( Main.class, args); // tell spring to run this class as the app
    }

    // ctor: any initialization goes here
    public Main() {
        logger.info("Entering ctor.");
        logger.info("Exiting ctor.");
    }

    // this is the "entrypoint" - the bare String[] args get converted by Spring into ApplicationArguments
    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("Entering run.");

        logger.info("Nifty command line app is doing its job.");

        logger.info("Exiting run.");
    }
}
