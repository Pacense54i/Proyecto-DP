import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class Campeonato here.
 * 
 * @author (Carlos Garcia Sanchez, Sergio Jimenez Macias, Alfonso David Recio Calderon) 
 * @version (1.0)
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
        Tenista aux;
        int tamLista;
        int i;
        i = 0;
        nombre = " ";
        
        //se realiza un bucle while dado que no se el numero exacto de
        //posiciones que voy a tener a la hora de llamar al modulo
        //mostrarCaracteristicas(), esto es apicable tanto 
        //a la lista competidores como a eliminados
        
        tamLista = competidores.size(); //tamaño de la lista competidores
        System.out.println("==Mostrando Tenista de la lista de competidores==" );
        while(i < tamLista){
            aux = competidores.get(i);
            aux.mostrarTenista();
            i = i + 1;
        }
        
        i = 0;
        tamLista = eliminados.size(); //tamaño de la lista eliminados
        System.out.println("==Mostrando Tenista de la lista de eliminados==" );
        while(i < tamLista){
            aux = eliminados.get(i);
            aux.mostrarTenista();
            i = i + 1;
        }

    }

    /**
     * Inscribe a los tenistas en la competicion
     * (añade tenistas a la lista de competidores)
     * 
     * @param Tenista T
     */
    public void inscribirJugadores(Tenista T)
    {
        competidores.add(T);
    }
    
    /**
     * Comprueba que tenista ha ganado el partido y hace lo correspondiente si el tenista ha ganado o ha perdido
     *
     * @param  Tenistas t1 y t2 
     */
    public void comprobacionVictoria(Tenista t1,Tenista t2,int tamanoLista,int i)
    {
        if( t1.getPuntosAcumulados() == t2.getPuntosAcumulados() ){
                    double sumat1,sumat2;
                    sumat1 = t1.getSaque() + t1.getResto();
                    sumat2 = t2.getSaque() + t2.getResto();
                    if (sumat1 > sumat2){
                        //sumat2 habra ganado
                        eliminados.add(t1);
                        competidores.set(i,t2);
                        competidores.remove(tamanoLista-1);
                    }
                    else{
                        //sumat1 habra gando dado que sumat2 es menor
                        eliminados.add(t2);
                        competidores.remove(tamanoLista-1);
                    }
                }
                else{
                    if( t1.getPuntosAcumulados() > t2.getPuntosAcumulados() ){//t1 es mayor, gana t1
                        eliminados.add(t2);
                        competidores.remove(tamanoLista-1);
                    }
                    else{//t2 es mayor, gana t2
                        eliminados.add(t1);
                        competidores.set(i,t2);
                        competidores.remove(tamanoLista-1);
                    }
                }
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
        int tamanoLista;
        
        //PRIMERA RONDA (4 veces)
            for(int i=0; i < 4;i++){
                t1 = competidores.get(i);
                tamanoLista = competidores.size();
                t2 = competidores.get(tamanoLista-1);
                
                juego (t1,t2);
                
                comprobacionVictoria(t1,t2,tamanoLista,i);
            }
            
        //A esta altura hemos terminado la primera ronda y se han eliminado la mitad de jugadores
        //SEGUNDA RONDA (2 veces)
            for(int i=0; i < 2;i++){
                t1 = competidores.get(i);
                tamanoLista = competidores.size();
                t2 = competidores.get(tamanoLista-1);
                
                juego (t1,t2);
                
                comprobacionVictoria(t1,t2,tamanoLista,i);
            }    
            
        //ULTIMA RONDA (1 vez)

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
