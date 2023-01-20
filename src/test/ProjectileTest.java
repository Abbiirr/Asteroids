package test;

import game.Projectile;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectileTest {
    Projectile projectile = new Projectile(5, 10);
    @Test
    @DisplayName("Check if move is alright in X")
    void moveX() {
        double changeX = Math.cos(Math.toRadians(projectile.getShapeHeavenlyBody().getRotate()));
        double newX = projectile.getShapeHeavenlyBody().getTranslateX() + changeX*3;

        projectile.move();

        assertEquals(newX, projectile.getShapeHeavenlyBody().getTranslateX());
    }

    @Test
    @DisplayName("Check if move is alright in Y")
    void moveY() {
        double changeY = Math.sin(Math.toRadians(projectile.getShapeHeavenlyBody().getRotate()));
        double newY = projectile.getShapeHeavenlyBody().getTranslateY() + changeY*3;



        projectile.move();

        assertEquals(newY, projectile.getShapeHeavenlyBody().getTranslateY());
    }
}