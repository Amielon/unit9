/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ami
 */
public class CadenasAlumnoTest {
    
    public CadenasAlumnoTest() {
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
     * Test of sonIguales method, of class CadenasAlumno.
     */
    @Test
    public void testSonIguales() {
        System.out.println("sonIguales");
        String cadena1 = "entornos";
        String cadena2 = "ento";
        CadenasAlumno instance = new CadenasAlumno();
        boolean expResult = false;
        boolean result = instance.sonIguales(cadena1, cadena2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EsMayor method, of class CadenasAlumno.
     */
    @Test
    public void testEsMayor() {
        System.out.println("EsMayor");
        String cadena1 = "";
        String cadena2 = "";
        CadenasAlumno instance = new CadenasAlumno();
        boolean expResult = false;
        boolean result = instance.EsMayor(cadena1, cadena2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EsMenor method, of class CadenasAlumno.
     */
    @Test
    public void testEsMenor() {
        System.out.println("EsMenor");
        String cadena1 = "";
        String cadena2 = "";
        CadenasAlumno instance = new CadenasAlumno();
        boolean expResult = false;
        boolean result = instance.EsMenor(cadena1, cadena2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comparaIgnorandoMayusculas method, of class CadenasAlumno.
     */
    @Test
    public void testComparaIgnorandoMayusculas() {
        System.out.println("comparaIgnorandoMayusculas");
        String cadena1 = "";
        String cadena2 = "";
        CadenasAlumno instance = new CadenasAlumno();
        boolean expResult = false;
        boolean result = instance.comparaIgnorandoMayusculas(cadena1, cadena2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reemplazaTodos method, of class CadenasAlumno.
     */
    @Test
    public void testReemplazaTodos() {
        System.out.println("reemplazaTodos");
        String cadena = "";
        char regla = ' ';
        char cambio = ' ';
        CadenasAlumno instance = new CadenasAlumno();
        String expResult = "";
        String result = instance.reemplazaTodos(cadena, regla, cambio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reemplazaPrimero method, of class CadenasAlumno.
     */
    @Test
    public void testReemplazaPrimero() {
        System.out.println("reemplazaPrimero");
        String cadena = "";
        char regla = ' ';
        char cambio = ' ';
        CadenasAlumno instance = new CadenasAlumno();
        String expResult = "";
        String result = instance.reemplazaPrimero(cadena, regla, cambio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of muestraSplitLimite method, of class CadenasAlumno.
     */
    @Test
    public void testMuestraSplitLimite() {
        System.out.println("muestraSplitLimite");
        String cadena = "";
        char regla = ' ';
        int limite = 0;
        CadenasAlumno instance = new CadenasAlumno();
        instance.muestraSplitLimite(cadena, regla, limite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of muestraSplit method, of class CadenasAlumno.
     */
    @Test
    public void testMuestraSplit() {
        System.out.println("muestraSplit");
        String cadena = "";
        char regla = ' ';
        CadenasAlumno instance = new CadenasAlumno();
        instance.muestraSplit(cadena, regla);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quitaEspacios method, of class CadenasAlumno.
     */
    @Test
    public void testQuitaEspacios() {
        System.out.println("quitaEspacios");
        String cadena = "";
        CadenasAlumno instance = new CadenasAlumno();
        String expResult = "";
        String result = instance.quitaEspacios(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertirMayusculas method, of class CadenasAlumno.
     */
    @Test
    public void testConvertirMayusculas() {
        System.out.println("convertirMayusculas");
        String cadena = "";
        CadenasAlumno instance = new CadenasAlumno();
        String expResult = "";
        String result = instance.convertirMayusculas(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertirMinusculas method, of class CadenasAlumno.
     */
    @Test
    public void testConvertirMinusculas() {
        System.out.println("convertirMinusculas");
        String cadena = "";
        CadenasAlumno instance = new CadenasAlumno();
        String expResult = "";
        String result = instance.convertirMinusculas(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of longitudCadena method, of class CadenasAlumno.
     */
    @Test
    public void testLongitudCadena() {
        System.out.println("longitudCadena");
        String cadena = "";
        CadenasAlumno instance = new CadenasAlumno();
        long expResult = 0L;
        long result = instance.longitudCadena(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empiezaCon method, of class CadenasAlumno.
     */
    @Test
    public void testEmpiezaCon() {
        System.out.println("empiezaCon");
        String cadena = "";
        char prefijo = ' ';
        CadenasAlumno instance = new CadenasAlumno();
        boolean expResult = false;
        boolean result = instance.empiezaCon(cadena, prefijo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of acabaEn method, of class CadenasAlumno.
     */
    @Test
    public void testAcabaEn() {
        System.out.println("acabaEn");
        String cadena = "";
        char sufijo = ' ';
        CadenasAlumno instance = new CadenasAlumno();
        boolean expResult = false;
        boolean result = instance.acabaEn(cadena, sufijo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of posicionPrimeraCadena method, of class CadenasAlumno.
     */
    @Test
    public void testPosicionPrimeraCadena() {
        System.out.println("posicionPrimeraCadena");
        String cadena = "";
        char letra = ' ';
        CadenasAlumno instance = new CadenasAlumno();
        long expResult = 0L;
        long result = instance.posicionPrimeraCadena(cadena, letra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extraerSubstring method, of class CadenasAlumno.
     */
    @Test
    public void testExtraerSubstring_String_int() {
        System.out.println("extraerSubstring");
        String cadena = "";
        int posicionInicio = 0;
        CadenasAlumno instance = new CadenasAlumno();
        String expResult = "";
        String result = instance.extraerSubstring(cadena, posicionInicio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extraerSubstring method, of class CadenasAlumno.
     */
    @Test
    public void testExtraerSubstring_3args() {
        System.out.println("extraerSubstring");
        String cadena = "";
        int posicionInicio = 0;
        int posicionFinal = 0;
        CadenasAlumno instance = new CadenasAlumno();
        String expResult = "";
        String result = instance.extraerSubstring(cadena, posicionInicio, posicionFinal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of concatenaCadenas method, of class CadenasAlumno.
     */
    @Test
    public void testConcatenaCadenas() {
        System.out.println("concatenaCadenas");
        String cadena1 = "";
        String cadena2 = "";
        CadenasAlumno instance = new CadenasAlumno();
        String expResult = "";
        String result = instance.concatenaCadenas(cadena1, cadena2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class CadenasAlumno.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CadenasAlumno.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
