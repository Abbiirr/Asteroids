package test;

import game.Asteroid;
import game.ProjectileGenerator;
import javafx.scene.layout.Pane;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ProjectileGeneratorTest {

    @Test
    @DisplayName("Generate asteroids")
    void checkForNull() {
        ArrayList<Asteroid> asteroids = new ArrayList<>();
        Pane pane = new Pane();
        ProjectileGenerator projectileGenerator = new ProjectileGenerator();
        projectileGenerator.generateAsteroids(asteroids);
        assertNotNull(asteroids);
    }

}