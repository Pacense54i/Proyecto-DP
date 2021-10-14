
/**
 * Write a description of class Tenista here.
 * 
 * @author (Carlos Garcia Sanchez, Sergio Jimenez Macias, Alfonso David Recio Calderon) 
 * @version (1.0)
 */
public class Tenista
{
    // instance variables - replace the example below with your own
    private double saque;
    private double resto;
    private int ranking;
    private double puntosAcumulados;
    private double guardarPtoSaque; 
    private String nombre;
    private String pais;
    private Zapatillas zapatilla;
    // guardarPtoSaque es una variable creada para guardar 
    //los puntos que ha conseguido un tenista con su saque
    //Al ser una variable creada con ese proposito no es necesario mostrarla 
    //por pantalla en el metodo mostrarTenista
    /**
     * Constructor for objects of class Tenista
     */
    public Tenista()
    {
        // initialise instance variables
        saque = 0;
        resto = 0;
        ranking = 0;
        puntosAcumulados = 0;
        guardarPtoSaque = 0;
        nombre = " ";
        pais = " ";
        zapatilla = new Zapatillas();
    }

    /**
     * Muestra por pantalla los valores de la variable de la clase Tenista
     */
    public void mostrarTenista()
    {
        System.out.println("Valor del saque del Tenista: " + saque);
        System.out.println("Valor del resto del Tenista: " + resto);
        System.out.println("Ranking del Tenista: " + ranking);
        System.out.println("PuntosAcumulados del Tenista: " + puntosAcumulados);
        System.out.println("Mostrando nombre del Tenista: " + nombre);
        System.out.println("Mostrando el pais del Tenista: " + pais);
        System.out.println("Mostrando Zapatilla del Tenista: " );
        zapatilla.mostrarZapatillas();
    }
    
    /**
     * Set saque1 to specify the saque of the Tenista
     * 
     * @param double saque1
     */
    public void setSaque(double saque1)
    {
        this.saque = saque1;
    }
    
    /**
     * Devuelve el valor guardado en la variable saque
     * 
     * @return double saque
     */
    public double getSaque()
    {
        return this.saque;
    }
    
    
    /**
     * Set rest to specify the resto of the Tenista
     * 
     * @param double rest
     */
    public void setResto(double rest)
    {
        this.resto = rest;
    }
    
    /**
     * Devuelve el valor guardado en la variable resto
     * 
     * @return double resto
     */
    public double getResto()
    {
        return this.resto;
    }
    
    
    /**
     * Set rankin to specify the ranking of the Tenista
     * 
     * @param int rankin
     */
    public void setRanking(int rankin)
    {
        this.ranking = rankin;
    }
    
    /**
     * Devuelve el valor guardado en la variable ranking
     * 
     * @return int ranking
     */
    public int getRanking()
    {
        return this.ranking;
    }
    
    
    /**
     * Set ptoAcumulados to specify the puntosAcumulados of the Tenista
     * 
     * @param double puntosAcomulados
     */
    public void setPuntosAcumulados(double ptoAcumulados)
    {
        this.puntosAcumulados = ptoAcumulados;
    }
    
    /**
     * Devuelve el valor guardado en la variable puntosAcumulados
     * 
     * @return double puntosAcomulados
     */
    public double getPuntosAcumulados()
    {
       return this.puntosAcumulados;
    }
    
    
    /**
     * Set guardarSaque to specify the guardarPtoSaque of the Tenista
     * 
     * @param double guardarSaque
     */
    public void setGuardarPtoSaque(double guardarSaque)
    {
       this.guardarPtoSaque = guardarSaque;
    }
    
    /**
     * Devuelve el valor guardado en la variable guardarPtoSaque
     * 
     * @return double guardarPuntosSaque
     */
    public double getGuardarPtoSaque()
    {
       return this.guardarPtoSaque;
    }
    
    
    
    /**
     * Set name to specify the nombre of the Tenista
     * 
     * @param string name
     */
    public void setNombre(String name)
    {
        this.nombre = name;
    }
    
    /**
     * Devuelve el valor guardado en la variable nombre
     * 
     * @return string nombre
     */
    public String getNombre()
    {
       return this.nombre;
    }
    
    
    /**
     * Set country to specify the pais of the Tenista
     * 
     * @param string country
     */
    public void setPais(String country)
    {
        this.pais = country;
    }
    
    /**
     * Devuelve el valor guardado en la variable pais
     * 
     * @return string pais
     */
    public String getPais()
    {
       return this.pais;
    }
    
    
    /**
     * Set calzado to specify the zapatilla of the Tenista
     * 
     * @param calzado es de tipo Zapatilla
     */
    public void setZapatilla(Zapatillas calzado)
    {
        this.zapatilla = calzado;
    }
    
    /**
     * Devuelve el valor guardado en la variable zapatilla
     * 
     * @return Zapatilla
     */
    public Zapatillas getZapatilla()
    {
       return this.zapatilla;
    }
    
    
    /**
     * Devuelve el valor del saque del tenista con las zapatillas aux
     * 
     * @return result tipo double contiene el valor de multiplicar los puntos de la variable saque por el valor del saque
     */
    public double calcularSaque(Zapatillas aux)
    {
        double result;
        result = 0;
        
        result =  getSaque() * aux.calcularValorSaque();
        guardarPtoSaque = result;
        
        return result;
    }
    
    /**
     * Poner la pelota en juego
     */
    public void sacar()
    {
        double increment;
        increment = 0;
        Zapatillas aux = new Zapatillas();
        
        aux = getZapatilla();
        
        increment = getPuntosAcumulados() + calcularSaque(aux);
        
        setPuntosAcumulados(increment);
        
    }
    
    
    /**
     * Devuelve el valor del resto del tenista con las zapatillas aux
     * 
     * @return result tipo double contiene el valor de multiplicar los puntos de la variable resto por el valor del resto
     */
    public double calcularResto()
    {
        double result;
        result = 0;
        
        result =  resto * zapatilla.calcularValorResto();
        
        return result;
    }
    
    /**
     * Compara el resto del tenista t2 con el valor del saque del tenista t1. Si es mayor se incrementan los puntos acomulados
     * 
     * @param tenista oponente
     */
    public void restar(Tenista oponente)
    {
        double incrementar;
        double resto;
        resto = calcularResto();
        
            if(resto > oponente.getGuardarPtoSaque()){
                incrementar = getPuntosAcumulados() + resto;
                setPuntosAcumulados(incrementar);
            }
        //Al haber usado ya la variable guardarPtoSaque voy a ponerla a 0
        //para que no haya problemas a la hora de volver a 
        //usarla con otro tenista
        guardarPtoSaque = 0;
     }
     
     /**
     * Pone en juego a los tenistas
     * 
     * @param tenista oponente
     */
    public void jugar(Tenista oponente)
    {
        sacar();
        oponente.restar(this);
    }
}
    
    
  
