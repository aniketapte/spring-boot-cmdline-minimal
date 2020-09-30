package com.aniketapte.cmdlineapp;

import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

// logging imports - note the junit group
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

// import asserts (note the static import)
import static org.junit.jupiter.api.Assertions.assertEquals;

/* this annotation tells Spring Boot to look for a main
configuration class (e.g. one with @SpringBootApplication) and use it to create
a Spring application context
In our case, the com.aniketapte.cmdlineapp.Main class is annotated as a Spring
application. Note - it's best to have a simple ctor for the app class.
*/
@SpringBootTest
class MainTest {
    private static final Logger logger = LoggerFactory.getLogger( MainTest.class );

    @Test // the test
    void contextLoads() {
        logger.info( () -> "Test: contextLoads"); // log something; note the closure

        // do some tests
        assertEquals( 3, 3 );
    }

    @Test // another test
    void test1() {
        logger.info( () -> "Test: test1"); // log something; note the closure

        // do some tests
        assertEquals( "something", "something" );
    }
}

