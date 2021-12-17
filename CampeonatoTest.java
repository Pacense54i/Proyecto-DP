

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
    // private RaquetaPotente r7;
    private ZapatillasAmortiguadas z1;
    private ZapatillasConAgarre z2;
    private ZapatillasConAgarre z3;
    private ZapatillasAmortiguadas z4;
    private ZapatillasConAgarre z5;
    private ZapatillasAmortiguadas z6;
    private Golpeadores t1;
    private Voleadores t2;
    private Golpeadores t3;
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
        // r7 = new RaquetaPotente("Dunlop CX200", 300, 700, 630, Encordado.ABIERTO);
        
        z1 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42, 5);
        z2 = new ZapatillasConAgarre("Vapor Lite", 42, 3);
        z3 = new ZapatillasConAgarre("CourtJam Bounce", 42, 3.5);
        z4 = new ZapatillasAmortiguadas("UberSonic 4k", 40, 6);
        z5 = new ZapatillasConAgarre("Gel-Resolution 8 GS", 40,  4);
        z6 = new ZapatillasAmortiguadas("Zoom GP Turbo", 43, 3.5);
        
        t1 = new Golpeadores("Novak Djokovic", z1, 90, 80, 1, "Serbia", 42);
        t2 = new Voleadores("Aryna Sabalenka" , z2, 67.5, 79.5, 2, "Bielorrusia", 40);
        t3 = new Golpeadores ("Ashleigh Barty", z6, 70, 80, 1, "Australia", 40);
        
        c1 = Campeonato.getInstancia();
        c1.introducirZapatillas(z3);
        c1.introducirZapatillas(z4);
        c1.introducirZapatillas(z5);
        c1.introducirZapatillas(z6);
        
        c1.introducirRaquetas(r1);
        c1.introducirRaquetas(r2);
        c1.introducirRaquetas(r3);
        c1.introducirRaquetas(r4);
        c1.introducirRaquetas(r5);
        c1.introducirRaquetas(r6);
        // c1.introducirRaquetas(r7);
        
        c1.inscribirJugadores(t1);
        c1.inscribirJugadores(t2);
        // c1.inscribirJugadores(t3);
        
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
    public void CompeticionTest() throws java.io.IOException
    {
        c1.competicion();
        assertEquals(t2, c1.TenistaGanador());
    }
    
    @Test
    public void asignarRaquetasTest() throws java.io.IOException
    {
        c1.asignarRaquetas();
        assertEquals(r6, t1.getRaqueta());
        assertEquals(r3, t2.getRaqueta());
    }
    
    

    
}






