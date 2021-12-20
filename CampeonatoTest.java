

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CampeonatoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CampeonatoTest
{
    private RaquetaPotente r1;
    private RaquetaControlada r2;
    private RaquetaEquilibrada r3;
    private RaquetaPotente r4;
    private RaquetaControlada r5;
    private RaquetaEquilibrada r6;
    private RaquetaControlada r7;
    private ZapatillasAmortiguadas z1;
    private ZapatillasConAgarre z2;
    private ZapatillasConAgarre z3;
    private ZapatillasAmortiguadas z4;
    // private ZapatillasConAgarre z5;
    // private ZapatillasAmortiguadas z6;
    private Golpeadores t1;
    private Voleadores t2;
    // private Golpeadores t3;
    private Campeonato c1;

    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    

    /**
     * Default constructor for test class CampeonatoTest
     */
    public CampeonatoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() throws java.io.IOException
    {
        r1 = new RaquetaPotente("Head Radical", 260, 680, 680, Encordado.ABIERTO);
        r2 = new RaquetaControlada("Babolat Drive", 340, 740, 600, Encordado.CERRADO);
        r3 = new RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO,2.5,4);
        r4 = new RaquetaPotente("Yonex Vcore", 300, 680, 650, Encordado.CERRADO);
        r5 = new RaquetaControlada("TFlash 300", 300, 680, 680, Encordado.CERRADO);
        r6 = new  RaquetaEquilibrada("Prince TT Bandit", 220, 680, 680, Encordado.CERRADO, 6, 3);
        r7 = new RaquetaControlada("Pure Aero", 340, 680, 720, Encordado.CERRADO);
        
        z1 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42, 5);
        z2 = new ZapatillasConAgarre("Vapor Lite", 42, 3);
        z3 = new ZapatillasConAgarre("CourtJam Bounce", 42, 3.5);
        z4 = new ZapatillasAmortiguadas("UberSonic 4k", 40, 6);
        
        
        t1 = new Golpeadores("Novak Djokovic", z1, 90, 80, 1, "Serbia", 42);
        t2 = new Voleadores("Aryna Sabalenka" , z2, 67.5, 79.5, 2, "Bielorrusia", 40);
        
        
        c1 = Campeonato.getInstancia();
        c1.inscribirJugadores(t1);
        c1.inscribirJugadores(t2);
        
        c1.introducirZapatillas(z3);
        c1.introducirZapatillas(z4);
        
        c1.introducirRaquetas(r1);
        c1.introducirRaquetas(r2);
        c1.introducirRaquetas(r3);
        c1.introducirRaquetas(r4);
        c1.introducirRaquetas(r5);
        c1.introducirRaquetas(r6);
        c1.introducirRaquetas(r7);
        
        
        
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        r1 = null;
        r2 = null;
        r3 = null;
        r4 = null;
        r5 = null;
        r6 = null;
        r7 = null;
        z1 = null;
        z2 = null;
        z3 = null;
        z4 = null;
        t1 = null;
        t2 = null;
        c1 = null;
    }

    @Test
    public void asignarRaquetasTest() throws java.io.IOException
    {
        c1.asignarRaquetas();
        assertSame(r6, t1.getRaqueta());
        assertSame(r3, t2.getRaqueta());
    }
    
    @Test
    public void competicionTest() throws java.io.IOException
    {
        c1.competicion();
        assertEquals(9072.24, t1.getPuntosAcumulados(), 0.1);
        assertEquals(41990.9, t2.getPuntosAcumulados(), 0.1);
    }
}







