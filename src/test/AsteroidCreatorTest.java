package test;

import game.AsteroidCreator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsteroidCreatorTest {

    @Test
    void createAsteroids() {
        AsteroidCreator asteroidCreator = new AsteroidCreator();
        assertNotNull(asteroidCreator.createAsteroids());
    }
}