import java.util.ArrayList;
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
     * Muestra por pantalla la lista de competidores de un campeonato
     */
    public void mostrarCompetidores()
    {
        Tenista aux;
        int tamLista;
        int i;
        i = 0;
        
        tamLista = competidores.size(); //tamaño de la lista competidores
        System.out.println("**********Listado de competidores");
        for(i=0; i < tamLista; i++){
            aux = competidores.get(i);
            aux.mostrarTenista();
        }
    }

    /**
     * Muestra por pantalla la lista de eliminados de un campeonato
     */
    public void mostrarEliminados()
    {
        Tenista aux;
        aux = new Tenista();
        int tamLista;
        int i;
        i = 0;
        
        tamLista = eliminados.size(); //tamaño de la lista eliminados
        System.out.println("**********Listado de eliminados");
        for(i=0; i < tamLista; i++){
            aux = eliminados.get(i);
            aux.mostrarTenista();
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
                }
                else{
                    //sumat1 habra gando dado que sumat2 es menor
                    eliminados.add(t2);
                }
                competidores.remove(tamanoLista-1); 
        }
        else{
                if( t1.getPuntosAcumulados() > t2.getPuntosAcumulados() ){//t1 es mayor, gana t1
                    eliminados.add(t2);
                }
                else{//t2 es mayor, gana t2
                    eliminados.add(t1);
                    competidores.set(i,t2);
                }
                competidores.remove(tamanoLista-1);
        }
    }
    
    
    /**
     * Pone en juego la competicion y comprueba la condicion de victoria
     */
    public void competicion()
    {
        Tenista t1;
        Tenista t2;
        Tenista ganador;
        int tamanoLista;
        tamanoLista =competidores.size();
        t1 = new Tenista();
        t2 = new Tenista();
        ganador = new Tenista();
        /*Ejecutamos while de tal manera que el código no terminará hasta
         * quedar un único tenista final que será el ganador de la 
         * competición.
        */
        System.out.println("***** Inicio del campeonato: Campeonato de Extremadura *****");
        mostrarCompetidores();
        
            while (competidores.size() > 1){
                for(int i=0; i < competidores.size()/2;i++){
                    t1 = competidores.get(i);
               
                    t2 = competidores.get(tamanoLista-1);
                    
                    juego (t1,t2);
                    
                    comprobacionVictoria(t1,t2,tamanoLista,i);
                    
                }
                System.out.println("---->>>>  Gana la competición:");
                ganador = competidores.get(0);
                ganador.mostrarTenista();
            }
            
        mostrarEliminados();
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
       
       t1.setPuntosAcumulados(0.0);
       t2.setPuntosAcumulados(0.0);
    }

}
