/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoDePrueba;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Noe
 */
public class ShapeTest {
    
    public ShapeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of area method, of class Shape.
     */
    @Test
    public void testAreaSquareTrue() {
        System.out.println("area Cuadrado");
        Shape instance = new Shape(1,8.0);
        double expResult = 64.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testAreaSquareFalse() {
        System.out.println("area Cuadrado");
        Shape instance = new Shape(1,4.0);
        double expResult = 25.0;
        double result = instance.area();
        boolean estaBien = expResult==result;
        assertFalse(estaBien);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testAreaCircleTrue() {
        System.out.println("area Circulo");
        Shape instance = new Shape(2,8.0);
        double expResult = 50.265482457436691815402294132472;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testAreaCircleFalse() {
        System.out.println("area Circulo");
        Shape instance = new Shape(1,4.0);
        double expResult = 25.0;
        double result = instance.area();
        boolean estaBien = expResult==result;
        assertFalse(estaBien);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testAreaRigth_TriangleTrue() {
        System.out.println("area Triangulo Rectangulo");
        Shape instance = new Shape(3,3.0);
        double expResult = 4.5;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testAreaRight_TriangleFalse() {
        System.out.println("area Triangulo Rectangulo");
        Shape instance = new Shape(3,4.0);
        double expResult = 25.0;
        double result = instance.area();
        boolean estaBien = expResult==result;
        assertFalse(estaBien);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
