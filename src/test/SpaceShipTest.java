package test;

import game.Main;
import game.SpaceShip;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaceShipTest {

    static int limitX  = Main.WIDTH;
    static int limitY = Main.HEIGHT;

    static SpaceShip spaceShip = new SpaceShip();

    @BeforeAll
    static void setUp() {
        System.out.println(limitX);
        System.out.println(limitY);



        System.out.println(spaceShip.getShapeHeavenlyBody().getTranslateX());
        System.out.println(spaceShip.getShapeHeavenlyBody().getTranslateY());

        for(int i = 0; i < 200; i++){
            spaceShip.move();
        }
//        spaceShip.move();

        System.out.println(spaceShip.getShapeHeavenlyBody().getTranslateX());
        System.out.println(spaceShip.getShapeHeavenlyBody().getTranslateY());
    }


    @Test
    @DisplayName("Spacship beyond limitX")
    void moveBeyondLimitX() {

        assertTrue(spaceShip.getShapeHeavenlyBody().getTranslateX() <= limitX);

    }

    @Test
    @DisplayName("Spaceship beyond limitY")
    void moveBeyondLimitY() {

        assertTrue(spaceShip.getShapeHeavenlyBody().getTranslateY() <= limitY);

    }
    @Test
    @DisplayName("Spaceship beyond 0 in x")
    void moveBeyond0X() {

        assertTrue(spaceShip.getShapeHeavenlyBody().getTranslateX() >= 0);

    }

    @Test
    @DisplayName("Spaceship beyond 0 in Y")
    void moveBeyond0Y() {

        assertTrue(spaceShip.getShapeHeavenlyBody().getTranslateY() >= 0 );

    }
}