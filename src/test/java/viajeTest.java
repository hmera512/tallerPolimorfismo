/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import co.unicauca.tallerpolimorfismo.cliente.ClienteMain;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Holmes
 */
public class viajeTest {
    
    public viajeTest() {
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
     * Test of main method, of class ClienteMain.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ClienteMain.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerViajes method, of class ClienteMain.
     */
    @Test
    public void testLeerViajes() {
        System.out.println("leerViajes");
        ClienteMain.leerViajes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarViajes method, of class ClienteMain.
     */
    @Test
    public void testMostrarViajes() {
        System.out.println("mostrarViajes");
        ClienteMain.mostrarViajes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
