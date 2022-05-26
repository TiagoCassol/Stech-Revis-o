/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author casso
 */
public class calcIMCTest {
    
    Scanner ler = new Scanner(System.in);
    
    public calcIMCTest() {
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
     * Test of imc method, of class calcIMC.
     */
    @Test
    public void testImc() {
        System.out.println("imc");
        double peso = 71.0;
        double altura = 1.73;
        calcIMC instance = new calcIMC();
        Double expResult = 23.722810651876106;
        Double result = instance.imc(peso, altura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resultado method, of class calcIMC.
     */
    @Test
    public void testResultado() {
        System.out.println("resultado");
        double imc = 23.722810651876106;
        calcIMC instance = new calcIMC();
        String expResult = "normal";
        String result = instance.resultado(imc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
