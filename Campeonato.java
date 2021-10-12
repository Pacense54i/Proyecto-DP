import java.util.ArrayList;
/**
 * Write a description of class Campeonato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Campeonato
{
    // instance variables - replace the example below with your own
    private String nombre;
    private ArrayList <Tenista> competidores;
    private ArrayList <Tenista> eliminados;

    /**
     * Constructor for objects of class Campeonato
     */
    public Campeonato()
    {
        // initialise instance variables
        nombre = " ";
        competidores = new ArrayList() ;
        eliminados = new ArrayList();
    }

    /**
     * Muestra por pantalla las caracteristicas de un campeonato
     */
    public void mostrarCaracteristicas()
    {
        nombre = " ";
        

    }

    /**
     * Inscribe a los tenistas en la competicion
     * (añade tenistas a la lista de competidores)
     */
    public void inscribirJugadores(Tenista T)
    {

        competidores.add(T);

    }
    /**
     * Pone en juego la competicion y comprueba la condicion de victoria
     */
    public void competicion()
    {
        //juego (t1,t2);
        

    }
    
    /**
     * Pone en juego el partido
     *
     * @param  Tenistas t1 y t2 
     */
    public void juego(Tenista t1, Tenista t2)
    {
       t1.jugar(t2);
       t2.jugar(t1);
    
    }

}
