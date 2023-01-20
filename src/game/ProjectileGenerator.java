<<<<<<< HEAD
package game;

import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.Random;

public class ProjectileGenerator {
     public  ProjectileGenerator() {

    };

    public void generateAsteroids(ArrayList<Asteroid> asteroids){
        Random rnd = new Random();
        int numberAsteroids = rnd.nextInt(8) + 3;
        for (int i = 0; i < numberAsteroids; i++) {
            Asteroid asteroid = new Asteroid();
            asteroids.add(asteroid);
        }
    }
    public void renderAsteroids(ArrayList<Asteroid> list, Pane pane){
        list.stream().forEach(projectile -> pane.getChildren().add(projectile.getShapeHeavenlyBody()));
    }
    public void makeAndRender(Pane gameWindow, ArrayList<Asteroid> asteroids){
//
        generateAsteroids(asteroids);
        renderAsteroids(asteroids,gameWindow);
    }
=======
package game;public class ProjectileGenerator {
>>>>>>> master
}
