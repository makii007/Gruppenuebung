package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Test class for DrinkQueue.java
 * @author Ivana Lehki
 */
public class DrinkQueueTest {

    private List<Object> testElements;
    private static Liquid testLiquid, testLiquid1, testLiquid2, testLiquid3,
            testLiquid4;
    DrinkQueue drinkQueue;
    DrinkQueue noElementsDrinkQueue;

    /**
     * Implementing setUp() that is executed each time before Testing
     * testElements Object List creates Objects to be tested
     * drinkQueue und noElementsDrinkQueue are Objects in tests
     */
    @BeforeEach
    void setUp(){
        testElements = new ArrayList<Object>();
        testLiquid = new Liquid("Bier", 0.7, 2.8);
        testLiquid1 = new Liquid("Schnapps", 0.2, 40.1);
        testLiquid2 = new Liquid("Bloody Mary", 1.0, 7.9);
        testLiquid3 = new Liquid("Rotwein", 0.1, 12.8);
        testLiquid4 = new Liquid("Med", 0.01, 22.7);

        testElements.add(testLiquid);
        testElements.add(testLiquid1);
        testElements.add(testLiquid2);
        testElements.add(testLiquid3);
        testElements.add(testLiquid4);

        drinkQueue = new DrinkQueue(5);

        drinkQueue.offer(testLiquid);
        drinkQueue.offer(testLiquid1);
        drinkQueue.offer(testLiquid2);
        drinkQueue.offer(testLiquid3);
        drinkQueue.offer(testLiquid4);

        noElementsDrinkQueue = new DrinkQueue(5);
    }

    /**
     * offerTest() tests the offer() Method in DrinkQueue.java
     */
    @Test
    void offerTest(){
        Assertions.assertEquals(testElements, drinkQueue.elements);
        Assertions.assertFalse(drinkQueue.offer(testLiquid));
    }

    /**
     * pollTest() tests the poll() Method in DrinkQueue.java
     */
    @Test
    void pollTest(){
        testElements.remove(0);

        drinkQueue.poll();

        Assertions.assertEquals(testElements, drinkQueue.elements);
    }

    /**
     * removeTest() tests the remove() Method in DrinkQueue.java
     * thrown Exception in the Method is also tested by remove() of the empty
     * List
     */
    @Test
    void removeTest(){
        testElements.remove(0);

        drinkQueue.remove();

        Assertions.assertEquals(testElements, drinkQueue.elements);
        Assertions.assertThrows(NoSuchElementException.class,
                () -> {noElementsDrinkQueue.remove();});
    }

    /**
     * peekTest() tests the peek() Method in DrinkQueue.java
     */
    @Test
    void peekTest(){
        Assertions.assertEquals(testElements.get(0), drinkQueue.peek());
    }

    /**
     * elementTest() tests the element() Method in DrinkQueue.java
     * thrown Exception in the Method is tested by searching an Element in an
     * empty List
     */
    @Test
    void elementTest(){
        Assertions.assertEquals(testElements.get(0), drinkQueue.element());
        Assertions.assertThrows(NoSuchElementException.class,
                () -> {noElementsDrinkQueue.element();});
    }



}
