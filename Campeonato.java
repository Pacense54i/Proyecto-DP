import java.util.ArrayList;
/**
 * Clase Campeonato la cual pone en funcionamiento el Campeonato
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
    
    //LA LISTA DE RAQUETAS ES UN TREE SET
    //LA LISTA DE ZAPATILLAS LA PONEMOS COMO UN ARRAYLIST
        

    /**
     * Contructor de los objetos de la clase Campeonato
     */
    public Campeonato()
    {
        // initialise instance variables
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
        Zapatillas z = new Zapatillas();
        
        for(Tenista t: competidores){
          System.out.println(t);
          z = t.getZapatilla();
          System.out.println(z);
        }        
    }

    /**
     * Muestra por pantalla la lista de eliminados de un campeonato
     */
    public void mostrarEliminados()
    {
        Zapatillas z = new Zapatillas();
        
        System.out.println("**********Listado de eliminados");
       
        for(Tenista t: eliminados){
          System.out.println(t);
          z = t.getZapatilla();
          System.out.println(z);
        }        
    }
    
    /**
     * Inscribe a los tenistas en la competicion
     * (añade tenistas a la lista de competidores)
     * 
     * @param Tenista T: Tenista que se quiere añadir a la lista de competidores
     */
    public void inscribirJugadores(Tenista T)
    {
        competidores.add(T);
    }
    
    /**
     * Comprueba que tenista ha ganado el partido y hace lo correspondiente si el tenista ha ganado o ha perdido
     *
     * @param  Tenistas t1 y t2 //RECORDATORIO:cambiar mas adelante
     * auxNum = numero de veces que se ha jugado un partido
     */
    
    //cada vez que añadamos un nuevo tenista a la lista de elominados tendremos que ordenar meterlo en orden descendiente
    public void comprobacionVictoria(Tenista t1,Tenista t2,int tamanoLista,int i,int auxNum)
    {
        
        if( t1.getPuntosAcumulados() == t2.getPuntosAcumulados() ){
                double sumat1,sumat2;
                sumat1 = t1.getSaque() + t1.getResto();
                sumat2 = t2.getSaque() + t2.getResto();
                if (sumat1 > sumat2){
                    //sumat2 habra ganado
                    
                    t1.setOrdenEliminado(auxNum);
                    eliminados.add(t1);
                    eliminados.sort( new ComparatorEliminados() );  //ordena la lista de eliminados de manera descendente
                    
                    competidores.set(i,t2); //intercambia la posicion del tenista
                    
                    //muestro ganador y perdedor
                    System.out.println("  ## Gana este juego:" + 
                    t2.getNombre() + " con: " + t2.getPuntosAcumulados() + " puntos acumulados.");
                    System.out.println("    ## Se elimina:" + 
                    t1.getNombre() + " con: " + t1.getPuntosAcumulados() + " puntos acumulados. Tenista eliminado num: " + 
                    t1.getOrdenEliminado());
                }
                else{
                    //sumat1 habra gando dado que sumat2 es menor
                    
                    t2.setOrdenEliminado(auxNum);
                    eliminados.add(t2);
                    eliminados.sort( new ComparatorEliminados() );  //ordena la lista de eliminados de manera descendente
                    
                    //muestro ganador y perdedor
                    System.out.println("  ## Gana este juego:" + 
                    t1.getNombre() + " con: " + t1.getPuntosAcumulados() + " puntos acumulados.");
                    System.out.println("    ## Se elimina:" + 
                    t2.getNombre() + " con: " + t2.getPuntosAcumulados() + " puntos acumulados. Tenista eliminado num: " + 
                    t2.getOrdenEliminado());
                }
                competidores.remove(tamanoLista); 
        }
        else{
                if( t1.getPuntosAcumulados() > t2.getPuntosAcumulados() ){
                    //t1 es mayor, gana t1
                    
                    t2.setOrdenEliminado(auxNum);
                    eliminados.add(t2);
                    eliminados.sort( new ComparatorEliminados() ); //ordena la lista de eliminados de manera descendente
                    
                    System.out.println("  ## Gana este juego:" + 
                    t1.getNombre() + " con: " + t1.getPuntosAcumulados() + " puntos acumulados.");
                    System.out.println("    ## Se elimina:" + 
                    t2.getNombre() + " con: " + t2.getPuntosAcumulados() + " puntos acumulados. Tenista eliminado num: " + 
                    t2.getOrdenEliminado());
                }
                else{
                    //t2 es mayor, gana t2
                    
                    t1.setOrdenEliminado(auxNum);
                    eliminados.add(t1);
                    eliminados.sort( new ComparatorEliminados() );  //ordena la lista de eliminados de manera descendente
                    
                    competidores.set(i,t2); //intercambia la posicion del tenista
                    
                                        
                    System.out.println("  ## Gana este juego:" + 
                    t2.getNombre() + " con: " + t2.getPuntosAcumulados() + " puntos acumulados.");
                    System.out.println("    ## Se elimina:" + 
                    t1.getNombre() + " con: " + t1.getPuntosAcumulados() + " puntos acumulados. Tenista eliminado num: " + 
                    t1.getOrdenEliminado());
                }
                competidores.remove(tamanoLista);
        }
    }
    
    
    /**
     * Pone en juego la competicion y comprueba la condicion de victoria
     */
    public void competicion()
    {
        Tenista t1 = new Tenista();
        Tenista t2 = new Tenista();
        Tenista ganador = new Tenista();
        int tamanoLista;
        int ronda = 1;
        int juego = 0;
        int auxNum = 0; //numero de veces que se ejecuta un partido
        int numBucle = 0; //numero de veces que se juega un partido en cada ronda
        
        /*Ejecutamos while de tal manera que el código no terminará hasta
         * quedar un único tenista final que será el ganador de la 
         * competición.
        */
        System.out.println("***** Inicio del campeonato: Campeonato de Extremadura *****");
        System.out.println("**********Listado de competidores");
        mostrarCompetidores();
        
            while (competidores.size() > 1){
                System.out.println("***** Ronda---->>>: " + ronda);
                numBucle = competidores.size()/2;
                for(int i=0; i < numBucle;i++){
                    System.out.println("   ### Juego ----------->>>: " + juego);
                    tamanoLista = competidores.size();
                    
                    t1 = competidores.get(i);
               
                    t2 = competidores.get(tamanoLista-1);
                    //mostramos nombres de los tenistas
                    System.out.println("    ## Tenista1 ---->>>:" + t1.getNombre());
                    System.out.println("    ## Tenista2 ---->>>:" + t2.getNombre());
                    
                    juego (t1,t2);
                       
                    auxNum++;
                    
                    comprobacionVictoria(t1,t2,tamanoLista-1,i,auxNum);
                    
                    juego++;
                }
                ronda++;
                juego = 0;
            }
        System.out.println("---->>>>  Gana la competición:");
        mostrarCompetidores();
        System.out.println("<<<<----");
        
        mostrarEliminados();
    }
    
    /**
     * Pone en juego el partido
     *
     * @param  Tenistas t1 y t2: Tenistas que van a jugar el partido
     */
    public void juego(Tenista t1, Tenista t2)
    {
       t1.setPuntosAcumulados(0.0);
       t2.setPuntosAcumulados(0.0);
       
       t1.jugar(t2);
       t2.jugar(t1);    
    }

    //VAMOS A NECESITAR UN METODO QUE INTRODUZCA LAS ZAPATILLAS Y LAS RAQUETAS EN SUS RESPECTIVAS LISTAS (X.ADD , Y.ADD)
}
