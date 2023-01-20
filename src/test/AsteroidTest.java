package test;

import game.Asteroid;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsteroidTest {
    
    Asteroid asteroid = new Asteroid();

    @Test
    @DisplayName("Check if move is alright in X")
    void moveX() {
        double changeX = Math.cos(Math.toRadians(asteroid.getShapeHeavenlyBody().getRotate()));
        double newX = asteroid.getShapeHeavenlyBody().getTranslateX() + changeX*0.5;

        asteroid.move();

        assertEquals(newX, asteroid.getShapeHeavenlyBody().getTranslateX());
    }

    @Test
    @DisplayName("Check if move is alright in Y")
    void moveY() {
        double changeY = Math.sin(Math.toRadians(asteroid.getShapeHeavenlyBody().getRotate()));
        double newY = asteroid.getShapeHeavenlyBody().getTranslateY() + changeY*0.5;



        asteroid.move();

        assertEquals(newY, asteroid.getShapeHeavenlyBody().getTranslateY());
    }
}