/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Compras;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class Venda_CarrosIT {
 
private Venda_Carros calc;

    public Venda_CarrosIT() {
    }
   
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       calc = new Venda_Carros();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testaSoma() {
        int resultado = calc.multiplicar(1, 72900);
        int valorEsperado = 72900;
        assertEquals(resultado, valorEsperado);
    }
}
