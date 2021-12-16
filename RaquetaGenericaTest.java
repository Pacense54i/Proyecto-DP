

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
    
    private RaquetaGenerica r;
    
    /**
     * Default constructor for test class RaquetaGenericaTest
     */
    public RaquetaGenericaTest()
    {
        r.setEstiloDeEncordado(Encordado.ABIERTO); 
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        r = new RaquetaGenerica();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        r = null;
    }
}
