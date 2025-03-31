/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Compras;

import Data.Compra;
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
public class Venda_Motos3IT {
    
    public Venda_Motos3IT() {
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

    @Test
    public void testCompraValida() {
        // Crie um objeto Compra para testar
        Compra compra = new Compra();

        // Defina os valores para a compra
        compra.setValorTotal(205700);
        compra.setMetodoPagamento("Cartão de Crédito");
    }
    
}
