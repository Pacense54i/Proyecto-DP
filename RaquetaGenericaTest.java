

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class RaquetaGenericaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RaquetaGenericaTest
{
    private RaquetaPotente r1;
    private RaquetaControlada r2;
    private RaquetaEquilibrada r3;
    private RaquetaPotente r4;

    /**
     * Default constructor for test class RaquetaGenericaTest
     */
    public RaquetaGenericaTest()
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
        r1 = new RaquetaPotente("Head Radical", 260, 680, 680, Encordado.ABIERTO);
        r2 = new RaquetaControlada("Babolat Drive", 340, 740, 600, Encordado.CERRADO);
        r3 = new RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO,2.5,4);
        r4 = new RaquetaPotente("Wilson Blade", 260, 690, 680, Encordado.ABIERTO);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }


    @Test
    public void CalcularPotenciaTest()
    {
        assertEquals(4.0, r1.calcularPotencia(), 0.1);
        assertEquals(10.0, r3.calcularPotencia(), 0.1);
        assertEquals(8.0, r4.calcularPotencia(), 0.1);
    }

    @Test
    public void CalcularControlTest()
    {
        assertEquals(25.0, r2.calcularControl(), 0.1);
        assertEquals(40.0, r3.calcularControl(), 0.1);
    }

    @Test
    public void CalcularVelocidadTest()
    {
        assertEquals(12.0, r1.calcularVelocidad(), 0.1);
        assertEquals(2.4, r2.calcularVelocidad(), 0.1);
        assertEquals(12.0, r4.calcularVelocidad(), 0.1);
    }
}
