package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringQueueTesting {

    private List<String> testingElements;
    private static Liquid testLiquid1, testLiquid2, testLiquid3,testLiquid4,testLiquid5;
    StringQueue filledStringQueue;
    StringQueue emptyStringQueue;

    /**
     * setting up a test list and a StringQueue
     * Implementing some elements for testing and adding those to both lists.
     */
    @BeforeEach
        void setUp(){
        testingElements = new ArrayList<String>();
        testLiquid1 = new Liquid("Bier",0.5,4.5);
        testLiquid2 = new Liquid("Wein",0.5,4.5);
        testLiquid3 = new Liquid("Spritzer",0.5,4.5);
        testLiquid4 = new Liquid("Mojito",0.2,20);
        testLiquid5 = new Liquid("GinTonic",0.1,40);

        emptyStringQueue = new StringQueue(5);
        filledStringQueue = new StringQueue(5);

        testingElements.add(0,"Bier");
        testingElements.add(1,"Wein");
        testingElements.add(2,"Spritzer");
        testingElements.add(3,"Mojito");
        testingElements.add(4,"GinTonic");


        filledStringQueue.offer(testLiquid1.getName());
        filledStringQueue.offer(testLiquid2.getName());
        filledStringQueue.offer(testLiquid3.getName());
        filledStringQueue.offer(testLiquid4.getName());
        filledStringQueue.offer(testLiquid5.getName());
    }


    @Test
        void offerTesting(){
        Assertions.assertEquals(testingElements, filledStringQueue.elements);

        Assertions.assertFalse(filledStringQueue.offer(testLiquid1));
    }

    @Test
        void peekTesting(){
        Assertions.assertEquals(testingElements.get(0),filledStringQueue.peek());
    }

    /**
     * Removing element from filled and empty list
     */
    @Test
        void removeTesting(){
        testingElements.remove(0);
        testingElements.remove(0);

        filledStringQueue.remove();
        filledStringQueue.remove();

        Assertions.assertEquals(testingElements, filledStringQueue.elements);

        assertThrows(NoSuchElementException.class, () -> {emptyStringQueue.remove();});
    }

    /**
     * Removing element from filled and empty list
     */
    @Test
        void pollTesting(){
        testingElements.remove(0);
        testingElements.remove(0);

        filledStringQueue.poll();
        filledStringQueue.poll();

        Assertions.assertEquals(testingElements, filledStringQueue.elements);

        Assertions.assertNull(emptyStringQueue.poll());
    }

    /**
     * searching element with filled and empty list
     */
    @Test
        void elementTesting(){
        Assertions.assertEquals(testingElements.get(0),filledStringQueue.element());
        assertThrows(NoSuchElementException.class, () -> {emptyStringQueue.element();});
    }
}
