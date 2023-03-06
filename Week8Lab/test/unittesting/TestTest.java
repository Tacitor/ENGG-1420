/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittesting;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lukas
 */
public class TestTest {

    public TestTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testEqual() {
        System.out.println("equal");
        assertTrue(unittesting.Test.equal(new int[]{0}, new int[]{0}));
        assertTrue(unittesting.Test.equal(new int[]{0, 0}, new int[]{0, 0}));
        assertTrue(unittesting.Test.equal(new int[]{5, 6, 7}, new int[]{5, 6, 7}));
        assertFalse(unittesting.Test.equal(new int[]{0, 0}, new int[]{0, 0, 0}));
        assertFalse(unittesting.Test.equal(new int[]{0, 0, 0}, new int[]{0, 1, 0}));

    }

    @Test
    public void testScalarMultiplication() {
        System.out.println("scalarMultiplication");
        assertEquals(39, unittesting.Test.scalarMultiplication(new int[]{3, 4}, new int[]{5, 6}));
        assertEquals(-39, unittesting.Test.scalarMultiplication(new int[]{-3, 4}, new int[]{5, -6}));
        assertEquals(0, unittesting.Test.scalarMultiplication(new int[]{5, 9}, new int[]{-9, 5}));

    }

}
