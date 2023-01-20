package test;

import game.Asteroid;
import game.HeavenlyBody;
import game.SpaceShip;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeavenlyBodyTest {
    HeavenlyBody heavenlyBody = new Asteroid();

    @Test
    @DisplayName("Test getShapeHeavenlyBody")
    void getShapeHeavenlyBody() {
        Polygon polygon = new Polygon(10, 10, 10, 10, 10, 10, 10, 10);
        int initialX = 10;
        int initialY = 10;
        HeavenlyBody heavenlyBody1 = new Asteroid(polygon, initialX,initialY);
        assertSame(polygon, heavenlyBody1.getShapeHeavenlyBody());
    }

    @Test
    @DisplayName("Turn left")
    void turnLeft() {
        double position = heavenlyBody.getShapeHeavenlyBody().getRotate();
        heavenlyBody.turnLeft();
        assertEquals(position-5, heavenlyBody.getShapeHeavenlyBody().getRotate());
    }

    @Test
    @DisplayName("Turn right")
    void turnRight() {
        double position = heavenlyBody.getShapeHeavenlyBody().getRotate();
        heavenlyBody.turnRight();
        assertEquals(position+5, heavenlyBody.getShapeHeavenlyBody().getRotate());
    }

    @Test
    @DisplayName("Move X")
    void moveX() {
        double changeX = Math.cos(Math.toRadians(heavenlyBody.getShapeHeavenlyBody().getRotate()));
        double newX = heavenlyBody.getShapeHeavenlyBody().getTranslateX() + changeX;

        heavenlyBody.move();

        assertEquals(newX, heavenlyBody.getShapeHeavenlyBody().getTranslateX());
    }
    @Test
    @DisplayName("Move Y")
    void moveY() {

        double changeY = Math.sin(Math.toRadians(heavenlyBody.getShapeHeavenlyBody().getRotate()));
        double newY = heavenlyBody.getShapeHeavenlyBody().getTranslateY() + changeY;



        heavenlyBody.move();

        assertEquals(newY, heavenlyBody.getShapeHeavenlyBody().getTranslateY());
    }

    @Test
    @DisplayName("Test collide for false")
    void collideFalse() {
        HeavenlyBody heavenlyBody = new Asteroid();
        double x = heavenlyBody.getShapeHeavenlyBody().getTranslateX();
        double y = heavenlyBody.getShapeHeavenlyBody().getTranslateY();
        Polygon other = new Polygon();
        other.getPoints().addAll(heavenlyBody.getShapeHeavenlyBody().getPoints());
        other.setTranslateX(x+100);
        other.setTranslateY(y+100);
        assertFalse(heavenlyBody.collide(other));
    }
    @Test
    @DisplayName("Test collide for true")
    void collideTrue() {

        double x = heavenlyBody.getShapeHeavenlyBody().getTranslateX();
        double y = heavenlyBody.getShapeHeavenlyBody().getTranslateY();
        Polygon other = new Polygon();
        other.getPoints().addAll(heavenlyBody.getShapeHeavenlyBody().getPoints());
        other.setTranslateX(x);
        other.setTranslateY(y);
//        System.out.println(other.getTranslateX());
//        System.out.println(other.getTranslateY());
//        System.out.println(heavenlyBody.getShapeHeavenlyBody().getTranslateX());
//        System.out.println(heavenlyBody.getShapeHeavenlyBody().getTranslateX());
//        System.out.println(other.getLayoutBounds());
//        System.out.println(heavenlyBody.getShapeHeavenlyBody().getLayoutBounds());
        assertTrue(heavenlyBody.collide(other));
    }
}