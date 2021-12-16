

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ZapatillasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ZapatillasTest
{
    private ZapatillasAmortiguadas z1;
    private ZapatillasConAgarre z2;
    private ZapatillasConAgarre z3;
    private ZapatillasAmortiguadas z4;
    
    /**
     * Default constructor for test class ZapatillasTest
     */
    public ZapatillasTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        z1 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42, 5);
        z2 = new ZapatillasConAgarre("Court Vapor React", 40, 5);
        z3 = new ZapatillasConAgarre("Vapor Lite", 42, 3);
        z4 = new ZapatillasAmortiguadas("Court Lite", 39, 3);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        z1 = null;
        z2 = null;
        z3 = null;
        z4 = null;
    }

    @Test
    public void calcularValorSaqueTest()
    {
        assertEquals(10.8, z1.calcularValorSaque(), 0.1);
        assertEquals(6, z2.calcularValorSaque(), 0.1);
        assertEquals(3.6, z3.calcularValorSaque(), 0.1);
        assertEquals(6.48, z4.calcularValorSaque(), 0.1);
    }
    
    @Test
    public void calcularValorRestoTest()
    {
        assertEquals(6.5, z1.calcularValorResto(), 0.1);
        assertEquals(11.05, z2.calcularValorResto(), 0.1);
        assertEquals(6.63, z3.calcularValorResto(), 0.1);
        assertEquals(3.9, z4.calcularValorResto(), 0.1);
    }    
}

