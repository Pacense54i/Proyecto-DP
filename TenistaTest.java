

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.TreeSet;

/**
 * The test class TenistaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TenistaTest
{
    private RaquetaPotente r1;
    private RaquetaControlada r2;
    private RaquetaEquilibrada r3;
    private RaquetaPotente r4;
    private ZapatillasAmortiguadas z1;
    private ZapatillasConAgarre z2;
    private ZapatillasConAgarre z3;
    private ZapatillasAmortiguadas z4;
    private Golpeadores t1;
    private Voleadores t2;
    private Campeonato c1;
    
    /**
     * Default constructor for test class TenistaTest
     */
    public TenistaTest()
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
        
        z1 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42, 5);
        z2 = new ZapatillasConAgarre("Vapor Lite", 42, 3);
        z3 = new ZapatillasConAgarre("CourtJam Bounce", 42, 3.5);
        z4 = new ZapatillasAmortiguadas("UberSonic 4k", 40, 6);
        
        t1 = new Golpeadores("Novak Djokovic", z1, 90, 80, 1, "Serbia", 42);
        t2 = new Voleadores("Aryna Sabalenka" , z2, 67.5, 79.5, 2, "Bielorrusia", 40);
        t1.setRaqueta(r1);
        t2.setRaqueta(r2);
        c1 = Campeonato.getInstancia();
        c1.introducirZapatillas(z3);
        c1.introducirZapatillas(z4);
        c1.introducirRaquetas(r3);
        c1.introducirRaquetas(r4);
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
        z1 = null;
        z2 = null;
        z3 = null;
        z4 = null;
        t1 = null;
        t2 = null;
        c1 = null;
    }

    
    @Test
    public void JugarTest() throws java.io.IOException
    {
        assertEquals(0.0, t1.getPuntosAcumulados(), 0.1);
        assertEquals(0.0, t2.getPuntosAcumulados(), 0.1);
        t1.sacar();
        assertEquals(46656.0, t1.getPuntosAcumulados(), 0.1);
        t2.sacar();
        assertEquals(5831.9, t2.getPuntosAcumulados(), 0.1);
        t1.restar(t2);
        assertEquals(71616, t1.getPuntosAcumulados(), 0.1);
        t2.restar(t1);
        assertEquals(37457.1, t2.getPuntosAcumulados(), 0.1);
        t1.golpear();
        assertEquals(71617.2, t1.getPuntosAcumulados(), 0.1);
        t2.golpear();
        assertEquals(37458.6, t2.getPuntosAcumulados(), 0.1);
    }

    @Test
    public void ElegirZapatillaTest() throws java.io.IOException
    {
        ZapatillasConAgarre  z5 = new ZapatillasConAgarre("Court Vapor React", 40,  5);
        ZapatillasAmortiguadas  z6 = new ZapatillasAmortiguadas("Zoom GP Turbo", 43, 3.5);
        c1.introducirZapatillas(z5);
        c1.introducirZapatillas(z6);
        
        t1.elegirZapatillas();
        assertSame(z3, t1.getZapatilla());
        t2.elegirZapatillas();
        assertSame(z4, t2.getZapatilla());

    }
    
    /**
     * En esta prueba hemos obtenido el primer elemento del treeSet para compararlo despues por la raqueta obtenida por el tenista.
     * Se hace esto asi dado que el tenista obtiene la raqueta del treeSet por lo que al ejecutar cambiarRaqueta deberia de apuntar al miso sitio que la primera raqueta del treeSet
     */
    @Test
    public void cambiarRaquetaTest() throws java.io.IOException
    {
        TreeSet <RaquetaGenerica> listaRaquetas = c1.getRaquetasCampeonato();
        RaquetaGenerica aux = new RaquetaGenerica();
        aux = listaRaquetas.first();
        
        t1.cambiarRaqueta();
        assertSame(aux, t1.getRaqueta());
        
        aux = listaRaquetas.first();
        
        t2.cambiarRaqueta();
        assertSame(aux, t2.getRaqueta());
        
        aux = null;
    }
}











