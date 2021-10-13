import java.util.ArrayList;
import java.util.List;
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
        Tenista t1;
        Tenista t2;
        List <Tenista> aux;
        int tamañoLista;
        
        //PRIMERA RONDA (4 veces)
            for(int i=0; i < 4;i++){
                t1 = competidores.get(i);
                tamañoLista = competidores.size();
                t2 = competidores.get(tamañoLista-1);
                
                juego (t1,t2);
                //t1.getPuntosAcumulados().equals(t2.getPuntosAcumulados())
                if( t1.getPuntosAcumulados() == t2.getPuntosAcumulados() ){
                    double sumat1,sumat2;
                    sumat1 = t1.getSaque() + t1.getResto();
                    sumat2 = t2.getSaque() + t2.getResto();
                    if (sumat1 > sumat2){
                        //sumat2 habra ganado
                        eliminados.add(t2);
                    }
                    else{
                        //sumat1 habra gando
                    }
                }
                else{
                    if( t1.getPuntosAcumulados() > t2.getPuntosAcumulados() ){//t1 es mayor, gana t1
                    eliminados.add(t2);
                    //competidores.remove(_index_)
                    //aux.add(t1);
                    }
                    else{//t2 es mayor, gana t2
                        
            
                    }
                }
            }
        
        
        //CONDICION DE VICTORIA

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
