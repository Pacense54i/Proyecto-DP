import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;


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
    
    private ArrayList <Zapatillas> zapatillasCampeonato;
    private TreeSet <RaquetaGenerica> raquetasCampeonato;
    private static Campeonato c=null;
        

    /**
     * Contructor de los objetos de la clase Campeonato
     */
    private Campeonato()
    {
        // initialise instance variables
        // initialise instance variables
        nombre = " ";
        competidores = new ArrayList() ;
        eliminados = new ArrayList();
        
        zapatillasCampeonato = new ArrayList();
        raquetasCampeonato = new TreeSet<>( new ComparatorRaquetaPotencia() );
    }
    
    public static Campeonato getInstancia(){
        if (c==null){
            return c= new Campeonato();
        }
        return c;
    }

    /**
     * Muestra por pantalla cada tenista de la lista de competidores de un campeonato
     */
    private void mostrarCompetidores()
    {
        Zapatillas z = new Zapatillas();
        
        for(Tenista t: competidores){
          System.out.println(t);
          z = t.getZapatilla();
          System.out.println(z);
        }        
    }

    /**
     * Muestra por pantalla cada tenista de la lista de eliminados de un campeonato
     */
    private void mostrarEliminados()
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
     * @param Tenista T: objeto de la clase Tenista que se quiere añadir a la lista de competidores
     */
    public void inscribirJugadores(Tenista T)
    {
        competidores.add(T);
    }
    
    /**
     * Comprueba que tenista ha ganado el partido y hace lo correspondiente si el tenista ha ganado o ha perdido
     *
     * @param  Tenistas t1 y t2 son los tenistas que estan jugando el partido, int tamanoLista es el valor del tamaño de la lista de competidores - 1,
     * int i es usa variable que indica la posicion en la que se esta recorriendo el bucle, auxNum = numero de veces que se ha jugado un partido.
     * 
     */
    
    //cada vez que añadamos un nuevo tenista a la lista de elominados tendremos que ordenar meterlo en orden descendiente
    private void comprobacionVictoria(Tenista t1,Tenista t2,int tamanoLista,int i,int auxNum)
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
                    System.out.println("    ## Gana este juego:" + 
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
                    System.out.println("    ## Gana este juego:" + 
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
                    
                    System.out.println("    ## Gana este juego:" + 
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
                    
                                        
                    System.out.println("    ## Gana este juego:" + 
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
        // raquetasCampeonato.toString();
        System.out.println("***** Inicio del campeonato: Campeonato de Extremadura *****");
        //Se le asignan raquetas a los tenistas
        this.asignarRaquetas();
        System.out.println("");
        System.out.println("**** Listado de competidores");
        mostrarCompetidores();
        
            while (competidores.size() > 1){
                System.out.println("***** Ronda---->>>: " + ronda);
                numBucle = competidores.size()/2;
                for(int i=0; i < numBucle;i++){
                    System.out.println("   ### Juego ----------->>>: " + juego);
                    tamanoLista = competidores.size();
                    
                    t1 = competidores.get(i);
               
                    t2 = competidores.get(tamanoLista-1);
  
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
     * pone los puntos acumulado de cada tenista a 0, posteriormente a cada tenista se le asigna una zapatilla y se ponen a jugar
     * primero el primer tenista contra el segundo y despues al reves
     *
     * @param  Tenistas t1 y t2: parametros de tipo Tenistas que van a jugar el partido
     */
    private void juego(Tenista t1, Tenista t2)
    {
       ArrayList <Zapatillas> auxZapatillasCampeonato = new ArrayList <Zapatillas> (zapatillasCampeonato); ///COPIA DE LA LISTA DE ZAPATILLAS
       Zapatillas ZapatillaAux = new Zapatillas();  //ZAPATILLA AUXILIAR 
       Zapatillas ZapatillaAux2 = new Zapatillas();  //ZAPATILLA AUXILIAR 
       
       //Se llama al metodo elegir zapatillas para que el tenista elija su zapatilla correspondiente
       //este metodo devuelve una zapatilla para que despues sea eliminada de la lista de zapatillas
       //esto se hace tanto con el tenista 1 como con el tenista 2
       
       //mostramos los tenistas que van a jugar con sus zapatillas
       System.out.println("    ## Tenista1 ---->>>:" + t1.getNombre());
       ZapatillaAux = t1.elegirZapatillas();
       t1.setZapatilla(ZapatillaAux);
       auxZapatillasCampeonato.remove(ZapatillaAux);
       zapatillasCampeonato = auxZapatillasCampeonato;
       
       //mostramos los tenistas que van a jugar con sus zapatillas
       System.out.println("    ## Tenista2 ---->>>:" + t2.getNombre()); 
       ZapatillaAux2 = t2.elegirZapatillas(); 
       t2.setZapatilla(ZapatillaAux2);
       auxZapatillasCampeonato.remove(ZapatillaAux2);
       zapatillasCampeonato = auxZapatillasCampeonato;
       
      
       
       t1.setPuntosAcumulados(0.0);
       t2.setPuntosAcumulados(0.0);
       
       t1.jugar(t2);
       t2.jugar(t1);    
    }

    
    /**
     * Añade una nueva zapatilla a la lista de Zapatillas
     * 
     * @param Zapatillas z: Zapatillas que quieres introducir en la lista de Zapatillas
     */
    public void introducirZapatillas(Zapatillas z)
    {
        zapatillasCampeonato.add(z);    
    }
    
    /**
     * Añade una nueva RaquetasGenerica a la lista de Raquetas
     * 
     * @param RaquetaGenerica r: Raqueta que quieres introducir en la lista de raquetas
     */
    public void introducirRaquetas(RaquetaGenerica r)
    {
        raquetasCampeonato.add(r);  
    }
    
    /**
     * Se asigna Raquetas a todos los tenitas del campeonato
     * 
     * Se seleccionará una raqueta del listado raquetasCampeonato (según su orden) y se asignará dicha raqueta al primer tenista del listado de competidores.
     * Así sucesivamente hasta que cada tenista tenga una raqueta para jugar. 
     * Si no hay suficientes raquetas para todos los tenistas se suspenderá temporalmente el campeonato.
     */
    private void asignarRaquetas()
    {
        RaquetaGenerica raquet = new RaquetaGenerica(); 
        Tenista aux = new Tenista ();
        
        //se mira el numero de raquetas y el de tenistas en la competicion
        if(raquetasCampeonato.size() < competidores.size() ){ //no hay suficientes raquetas para los competidores
            System.out.println( "No hay suficientes raquetas para los tenistas inscritos en el campeonato por lo que el campeonato se suspende.");
            //como no hemos dado exepciones no sabemos la manera de salirse del campeonato
        }
        else{ //el numero de raquetas es igual o mayor que el numero de comperidores del campeonato por lo que hay suficientes raquetas
            System.out.println("***** Asignando raquetas a tenistas *****");
            for(int i = 0; i < competidores.size(); i++){
                raquet = raquetasCampeonato.pollFirst(); //obtengo la primera raqueta de la lista
            
                aux = competidores.get(i);//obtengo el primer tenista de la lista
            
                aux.setRaqueta(raquet);// le asigno la raqueta al tenista
            
                System.out.println(raquet.toString() + " asignada a  -->> " + aux.getNombre() );
            }
        }
    
    }

    
    
    public Zapatillas buscarZapatillas(double numeroPie)
    {      
        boolean enc = false;
        Zapatillas aux = new Zapatillas();
        Tenista d;
        int i=0;
        
        while (i<zapatillasCampeonato.size() && enc==false){
              // d = competidores.get(i);
              aux = zapatillasCampeonato.get(i);
              // if (d.getNumPie() == numeroPie){
              if (aux.getNumero() == numeroPie){
                  enc=true;
                  System.out.println("       Zapatillas asignadas: " + aux.toString() );
                  // aux = d.getZapatilla(); //ni hace falta
                  zapatillasCampeonato.remove(i);
              }
              else{
                  i++;
              }
        }
        // if(enc==false){
            // System.out.println("No existe ninguna Zapatilla que se corresponda con el número de pie del tenista.");
        // }
        
        return aux;
    }
    /*
    Está hecho así por encima, que no se me ocurría otra cosa
    */ 
   
    //aqui hay un problema: Si el tenista no encuentra una zapatilla que es igual a su talla el tenista debe seguir con su zapatilla. 
    // Idea que se me acaba de ocurrir para solucionarlo es hacer un metodo buscar zapatilla que busque en la lista de zapatillas si hay una zapatilla para el tenista
    // devuelve true si la hay y false si no la hay y la idea es que en tenista este eso como condicion de entrada == true y si hay zapatilla 
    // ENTONCES SOLO AHI el tenista se cambia de zapatilla
}
