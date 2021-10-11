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
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void mostrarCaracteristicas()
    {
        // put your code here
        nombre = " ";

    }

    /**
     *
     */
    public void inscribirJugadores(Tenista T)
    {

        competidores.add(T);

    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public void competicion()
    {
        //juego (t1,t2);
        

    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public void juego(Tenista t1, Tenista t2)
    {
       t1.sacar();
       
        
    }

}
