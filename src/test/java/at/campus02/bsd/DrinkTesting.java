package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DrinkTesting {
    Liquid alcoholicLiquid;
    Liquid liquid;
    SimpleDrink alcoholicDrink, drink;

    /**
     * Implementing a Liquid object and a SimpleDrink object for testing
     */

    @BeforeEach
    void setUp(){
        alcoholicLiquid = new Liquid("Welschriesling", 0.75, 15);
        alcoholicDrink = new SimpleDrink("Wein", alcoholicLiquid);
        liquid = new Liquid("Apfelsaft", 0.5,0);
        drink = new SimpleDrink("Fruchtsaft", liquid);
    }

    // Tests for Drink.java and SimpleDrink.java

    @Test
    void VolumeTesting(){
        Assertions.assertEquals(0.75,alcoholicDrink.getVolume());
    }
    @Test
    void AlcoholPercentTesting(){
        Assertions.assertEquals(15,alcoholicDrink.getAlcoholPercent());
    }
    @Test
    void isAlcoholicTesting(){
        Assertions.assertTrue(alcoholicDrink.isAlcoholic());
        Assertions.assertFalse(drink.isAlcoholic());
    }
    @Test
    void getDrinkNameTesting(){
        Assertions.assertEquals("Fruchtsaft",drink.getName());
    }
    @Test
    void setDrinkNameTesting(){
        drink.setName("Name veraendert");
        Assertions.assertEquals("Name veraendert", drink.getName());
    }

    // Tests for Liquid.java

    @Test
    void setLiquidNameTesting(){
        liquid.setName("Name veraendert");
        Assertions.assertEquals("Name veraendert", liquid.getName());
    }

    @Test
    void setLiquidVolume(){
        liquid.setVolume(9.9);
        Assertions.assertEquals(9.9, liquid.getVolume());
    }

    @Test
    void setLiquidAlcoholPercentTesting(){
        liquid.setAlcoholPercent(30.8);
        Assertions.assertEquals(30.8, liquid.getAlcoholPercent());
    }

}
