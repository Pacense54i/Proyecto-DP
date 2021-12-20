import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



/**
 * Clase Campeonato la cual pone en funcionamiento el Campeonato
 * 
 * @author (Carlos Garcia Sanchez, Sergio Jimenez Macias, Alfonso David Recio Calderon) 
 * @version (1.0)
 */
public class Campeonato
{
    private String nombre;
    private ArrayList <Tenista> competidores;
    private ArrayList <Tenista> eliminados;
    
    private ArrayList <Zapatillas> zapatillasCampeonato;
    private TreeSet <RaquetaGenerica> raquetasCampeonato;
    private static Campeonato c = null;
        
    private BufferedWriter fichero;

    /**
     * Contructor de los objetos de la clase Campeonato
     */
    private Campeonato() throws IOException
    {
        nombre = " Campeonato de Extremadura ";
        competidores = new ArrayList() ;
        eliminados = new ArrayList();
        
        zapatillasCampeonato = new ArrayList<Zapatillas>();
        raquetasCampeonato = new TreeSet<RaquetaGenerica>( new ComparatorRaquetaPotencia() );
        
        fichero = new BufferedWriter(new FileWriter("SalidaProyecto.txt"));
    }
    
    public static Campeonato getInstancia() throws  IOException
    {
        if (c==null){
            return c = new Campeonato();
        }
        return c;
    }

    /**
     * Set name para especificar el nombre del campeonato
     * 
     * @param String name: almacena el String name en la variable nombre de la clase campeonato
     */
    public void setNombre(String name)
    {
        this.nombre = name;
    }
    
    /**
     * Devuelve el valor guardado en la variable nombre de la clase Campeonato
     * 
     * @return String nombre: nombre que tiene el Campeonato
     */
    public String getNombre()
    {
        return this.nombre;
    }
    
    /**
     * Devuelve la lista de Zapatillas
     * 
     * @return Arraylist: lista que contiene las zapatillas que proporciona el campeonato
     */
    public ArrayList getZapatillasCampeonato(){
        return this.zapatillasCampeonato;
    }
    
    /**
     * Devuelve el TreeSet raquetasCampeonato
     * 
     * @return TreeSet: arbol que contiene las raquetas que proporciona el campeonato
     */
    public TreeSet getRaquetasCampeonato(){
        return this.raquetasCampeonato;
    }
    
    /**
     * Devuelve el fichero en donde se esta escribiendo la salida de datos
     * 
     * @return BufferedWriter: devuelve la variable fichero del tipo BufferedWriter en donde se escribe la salida de datos a un fichero
     */
    public BufferedWriter getFichero(){
        return this.fichero;
    }
    
    /**
     * Muestra por pantalla cada tenista de la lista de competidores de un campeonato
     */
    private void mostrarCompetidores() throws IOException
    {
        iZapatillas z = null;
        Raqueta r = null;
        
        System.out.println("**** Listado de competidores");
        fichero.write("\n**** Listado de competidores");
        fichero.write("\n");
        
        for(Tenista t: competidores){
          System.out.println(t);
          z = t.getZapatilla();
          System.out.println(z);
          r = t.getRaqueta();
          System.out.println("    " + r);
          
          fichero.write("\n" + t.toString());
          fichero.write("\n" + z.toString());
          fichero.write("\n     " + r.toString());
          fichero.write("\n");
        }        
    }

    /**
     * Muestra por pantalla cada tenista de la lista de eliminados de un campeonato
     */
    private void mostrarEliminados() throws IOException
    {
        iZapatillas z = null;
        Raqueta r = null;
        
        System.out.println("**********Listado de eliminados");
        
        fichero.write("\n**********Listado de eliminados");
        fichero.write("\n");
       
        for(Tenista t: eliminados){
          System.out.println(t);
          z = t.getZapatilla();
          System.out.println(z);
          r = t.getRaqueta();
          System.out.println("    " + r);
          
          
          fichero.write("\n");
          fichero.write(t.toString());
          fichero.write("\n");
          fichero.write(z.toString());
          fichero.write("\n");
          fichero.write("    " + r.toString());
          fichero.write("\n");
        }        
    }
    
    /**
     * Muestra por pantalla las raquetas del listado de raquetas de la clase campeonato
     */
    private void mostrarRaquetasDisponibles() throws IOException
    {
        System.out.println("**********Listado de raquetas disponibles:");
        
        fichero.write("\n**********Listado de raquetas disponibles:");
        fichero.write("\n");
       
        for(Raqueta r: raquetasCampeonato){
          System.out.println(r);
          
          fichero.write("\n");
          fichero.write("    " + r.toString());
          fichero.write("\n");
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
     * Modulo que se encarga de insertar al tenista que ha perdido de la lista de eliminados
     * 
     * @param Tenista t: tenista que ha perdido el partido. Int auxNum:a uxNum = numero de veces que se ha jugado un partido.
     */
    private void eliminarTenista(Tenista t, int auxNum)
    {
        t.setOrdenEliminado(auxNum);
        eliminados.add(t);
        eliminados.sort( new ComparatorEliminados() );  //ordena la lista de eliminados de manera descendente
    }
    
    /**
     * Se muestra pòr pantalla quien ha ganado el juego
     * 
     * @param Tenista t: ganador del juego
     */
    private void mostrarGanador(Tenista t) throws IOException
    {
        System.out.println("    ## Gana este juego:" + t.getNombre() + " con: " + t.getPuntosAcumulados() + " puntos acumulados.");
                    
        fichero.write("\n     ## Gana este juego:" + t.getNombre() + " con: " + t.getPuntosAcumulados() + " puntos acumulados.");
    }
    
    /**
     * Se muestra pòr pantalla quien ha perdido el juego
     * 
     * @param Tenista t: perdedor del juego
     */
    private void mostrarPerdedor(Tenista t) throws IOException
    {
        System.out.println("    ## Se elimina:" + t.getNombre() + " con: " + t.getPuntosAcumulados() + " puntos acumulados. Tenista eliminado num: " 
        + t.getOrdenEliminado());
                    
        fichero.write("\n     ## Se elimina:" + t.getNombre() + " con: " + t.getPuntosAcumulados() + " puntos acumulados. Tenista eliminado num: "
        + t.getOrdenEliminado());
    }
    
    /**
     * Comprueba que tenista ha ganado el partido y hace lo correspondiente si el tenista ha ganado o ha perdido
     *
     * @param  Tenistas t1 y t2 son los tenistas que estan jugando el partido, int tamanoLista es el valor del tamaño de la lista de competidores - 1,
     * int i es usa variable que indica la posicion en la que se esta recorriendo el bucle, auxNum = numero de veces que se ha jugado un partido.
     * 
     */
    private void comprobacionVictoria(Tenista t1,Tenista t2,int tamanoLista,int i,int auxNum) throws IOException
    {
        
        if( t1.getPuntosAcumulados() == t2.getPuntosAcumulados() ){
                double sumat1,sumat2;
                sumat1 = t1.getSaque() + t1.getResto();
                sumat2 = t2.getSaque() + t2.getResto();
                if (sumat1 > sumat2){
                    //sumat2 habra ganado
                    eliminarTenista(t1,auxNum);
                    
                    competidores.set(i,t2); //intercambia la posicion del tenista
                    //a continuacion se muestra el ganador y perdedor por pantalla
                    mostrarGanador(t2);
                    mostrarPerdedor(t1);
                }
                else{
                    //sumat1 habra gando dado que sumat2 es menor
                    eliminarTenista(t2,auxNum);
                    //a continuacion se muestra el ganador y perdedor por pantalla
                    mostrarGanador(t1);
                    mostrarPerdedor(t2);
                }
                competidores.remove(tamanoLista); 
        }
        else{
                if( t1.getPuntosAcumulados() > t2.getPuntosAcumulados() ){
                    //t1 es mayor, gana t1
                    eliminarTenista(t2,auxNum);
                    //a continuacion se muestra el ganador y perdedor por pantalla
                    mostrarGanador(t1);
                    mostrarPerdedor(t2);
                }
                else{
                    //t2 es mayor, gana t2
                    eliminarTenista(t1,auxNum);
                    
                    competidores.set(i,t2); //intercambia la posicion del tenista
                    //a continuacion se muestra el ganador y perdedor por pantalla
                    mostrarGanador(t2);
                    mostrarPerdedor(t1);
                }
                competidores.remove(tamanoLista);
        }
    }
    
    /**
     * Muestra por pantalla los mensajes de inicio de la competicion, asigna las raquetas a los tenistas y muestra el listado de competidores y de raquetas disponibles
     */
    private void inicioDelCampeonato() throws IOException
    {
        System.out.println("***** Inicio del campeonato: " + getNombre() + " *****");
        fichero.write("***** Inicio del campeonato: Campeonato de Extremadura *****");
        //Se le asignan raquetas a los tenistas
        this.asignarRaquetas();
        System.out.println("");
        fichero.write("\n");
        
        mostrarCompetidores(); 
        mostrarRaquetasDisponibles();
    }
    
    /**
     * Pone en juego la competicion y comprueba la condicion de victoria
     */
    public void competicion() throws IOException
    {
        Tenista t1 = null;
        Tenista t2 = null;
        
        int tamanoLista;
        int ronda = 1;
        int juego = 0;
        int auxNum = 0; //numero de veces que se ejecuta un partido
        int numBucle = 0; //numero de veces que se juega un partido en cada ronda
        
        //Ejecutamos while de tal manera que el código no terminará hasta quedar un único tenista final que será el ganador de la competición.
        
        inicioDelCampeonato();
        
            while (competidores.size() > 1){
                System.out.println("***** Ronda---->>>: " + ronda);
                fichero.write("\n\n***** Ronda---->>>: " + ronda);
                
                numBucle = competidores.size()/2;
                for(int i=0; i < numBucle;i++){
                    System.out.println("   ### Juego ----------->>>: " + juego);
                    fichero.write("\n\n    ### Juego ----------->>>: " + juego);
                    
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
            
        mostrarResultados();
        
        try{
               comprobarRaquetasSuficientes();
           }
           catch(IOException e){
               System.out.println(e);
           }
        
        fichero.close();
    }
    
    
    /**
     * Muestra por pantalla los resultados de la competicion. 
     * Concretamente te muestra cual es el ganador y la lista de eliminados
     */
    private void mostrarResultados() throws IOException
    {
        System.out.println("---->>>>  Gana la competición:");
        fichero.write("\n\n---->>>>  Gana la competición:");
        
        mostrarCompetidores();
        
        System.out.println("<<<<----");
        fichero.write("\n<<<<----");
        fichero.write("\n");
        
        mostrarEliminados();  
    }
    
    /**
     * Pone en juego el partido
     * pone los puntos acumulado de cada tenista a 0, posteriormente a cada tenista se le asigna una zapatilla y se ponen a jugar
     * primero el primer tenista contra el segundo y despues al reves
     *
     * @param  Tenistas t1 y t2: parametros de tipo Tenistas que van a jugar el partido
     */
    private void juego(Tenista t1, Tenista t2) throws IOException
    {
       cambiarZapatillas(t1,t2);
       
       t1.setPuntosAcumulados(0.0);
       t2.setPuntosAcumulados(0.0);
       
       t1.jugar(t2);
       salidaCambiarRaqueta(t1);
       t2.jugar(t1);  
       salidaCambiarRaqueta(t2);      
    }

    /**
     *  Los dos Tenistas t1 y t2 se cambian de zapatillas eliminandose la zapatilla elegida de la lista de zapatillas disponible la zapatilla que se han puesto 
     *  
     *  @param Tenista t1, Tenista t2: objetos de clase tenista que se cambiaran de zapatillas
     */
    private void cambiarZapatillas(Tenista t1, Tenista t2) throws IOException
    {      
       //mostramos los tenistas que van a jugar con sus zapatillas
       System.out.println("    ## Tenista1  (" + t1.getClass().getName() + ")---->>>:" + t1.getNombre());
       fichero.write("\n     ## Tenista1  (" + t1.getClass().getName() + ")---->>>:" + t1.getNombre());
       
       //ejecuto elegir zapatilla y devuelvo la zapatilla que se ha puesto para elimonarla de la lista de Zapatillas
       iZapatillas aux = null;
       aux = t1.elegirZapatillas();
       zapatillasCampeonato.remove(aux);
       fichero.write("\n        Zapatillas asignadas: " + aux.toString());
       
       //mostramos los tenistas que van a jugar con sus zapatillas
       System.out.println("    ## Tenista2  (" + t2.getClass().getName() + ")---->>>:" + t2.getNombre()); 
       fichero.write("\n     ## Tenista2  (" + t2.getClass().getName() + ")---->>>:" + t2.getNombre());
       
       //ejecuto elegir zapatilla y devuelvo la zapatilla que se ha puesto para elimonarla de la lista de Zapatillas
       aux = t2.elegirZapatillas();
       zapatillasCampeonato.remove(aux); 
       fichero.write("\n        Zapatillas asignadas: " + aux.toString());
    }
    
    /**
     * Este modulo se encarga de escribir en el fichero de salida el cambio de raqueta de cada tenista
     * Modulo hecho para mostrar el cambio de raqueta del tenista en la clase Campeonato despues de hacer la llamada a jugar
     */
    private void salidaCambiarRaqueta(Tenista t) throws IOException
    {
      Raqueta aux = t.getRaqueta();
       fichero.write("\n        " + t.getNombre() + " cambia su raqueta por: " + aux.getClass().getName() 
        + " modelo =" + aux.getModelo() + " Velocidad = " + aux.calcularVelocidad());  
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
    public void asignarRaquetas() throws IOException
    {
        Raqueta raquet = null; 
        Tenista aux = null;
        
        //se mira el numero de raquetas y el de tenistas en la competicion
        if(!comprobarRaquetasSuficientes()){ 
            System.out.println("***** Asignando raquetas a tenistas *****");
            
            fichero.write("\n***** Asignando raquetas a tenistas *****");
            fichero.write("\n");
            
            for(int i = 0; i < competidores.size(); i++){
                raquet = raquetasCampeonato.pollFirst(); //obtengo la primera raqueta de la lista
            
                aux = competidores.get(i);//obtengo el primer tenista de la lista
            
                aux.setRaqueta(raquet);// le asigno la raqueta al tenista
            
                System.out.println(raquet.toString() + " asignada a  -->> " + aux.getNombre() );
                
                fichero.write("\n" + raquet.toString() + " asignada a  -->> " + aux.getNombre());
                fichero.write("\n");
            }
        }
    }
    
    /**
     * Comprueba si hay raquetas suficientes para dar a los tenistas
     * 
     * @return boolean: devuelve true si hay raquetas sucicientes o false si no hay raquetas suficientes para todos los tenistas
     * @throws IOException si no hay raquetas suficientes para los tenistas
     */
    private boolean comprobarRaquetasSuficientes() throws IOException
    {
        boolean aux = false;
        
        if(raquetasCampeonato.size() < competidores.size() ){ //no hay suficientes raquetas para los competidores
            aux = true;
            fichero.write("\n java.io.IOException: No hay suficientes raquetas para los tenistas inscritos en el campeonato por lo que EL CAMPEONATO SE SUSPENDE.");
            fichero.write("\n");
            fichero.close();
            
            throw new IOException("No hay suficientes raquetas para los tenistas inscritos en el campeonato por lo que el campeonato se suspende.");
            
        }
        
        return aux;
    }
}
