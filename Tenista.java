
/**
 * Write a description of class Tenista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        nombre = " ";
        pais = " ";
        zapatilla = new Zapatillas();
    }

    /**
     * Set saque1 to specify the saque of the Tenista
     */
    public void setSaque(double saque1)
    {
        this.saque = saque1;
    }
    
    /**
     * Devuelve el valor guardado en la variable saque
     */
    public double getSaque()
    {
        return this.saque;
    }
    
    
    /**
     * Set rest to specify the resto of the Tenista
     */
    public void setResto(double rest)
    {
        this.resto = rest;
    }
    
    /**
     * Devuelve el valor guardado en la variable resto
     */
    public double getResto()
    {
        return this.resto;
    }
    
    
    /**
     * Set rankin to specify the ranking of the Tenista
     */
    public void setRanking(int rankin)
    {
        this.ranking = rankin;
    }
    
    /**
     * Devuelve el valor guardado en la variable ranking
     */
    public int getRanking()
    {
        return this.ranking;
    }
    
    
    /**
     * Set ptoAcumulados to specify the puntosAcumulados of the Tenista
     */
    public void setPuntosAcumulados(double ptoAcumulados)
    {
        this.puntosAcumulados = ptoAcumulados;
    }
    
    /**
     * Devuelve el valor guardado en la variable puntosAcumulados
     */
    public double getPuntosAcumulados()
    {
       return this.puntosAcumulados;
    }
    
    
    /**
     * Set guardarSaque to specify the guardarPtoSaque of the Tenista
     */
    public void setGuardarPtoSaque(double guardarSaque)
    {
       this.guardarPtoSaque = guardarSaque;
    }
    
    /**
     * Devuelve el valor guardado en la variable guardarPtoSaque
     */
    public double getGuardarPtoSaque()
    {
       return this.guardarPtoSaque;
    }
    
    
    
    /**
     * Set name to specify the nombre of the Tenista
     */
    public void setNombre(String name)
    {
        this.nombre = name;
    }
    
    /**
     * Devuelve el valor guardado en la variable nombre
     */
    public String getNombre()
    {
       return this.nombre;
    }
    
    
    /**
     * Set country to specify the pais of the Tenista
     */
    public void setPais(String country)
    {
        this.pais = country;
    }
    
    /**
     * Devuelve el valor guardado en la variable pais
     */
    public String getPais()
    {
       return this.pais;
    }
    
    
    /**
     * Set calzado to specify the zapatilla of the Tenista
     */
    public void setZapatilla(Zapatillas calzado)
    {
        this.zapatilla = calzado;
    }
    
    /**
     * Devuelve el valor guardado en la variable zapatilla
     */
    public Zapatillas getZapatilla()
    {
       return this.zapatilla;
    }
    
    
    /**
     * Devuelve el valor del saque del tenista ti con las zapatillas aux
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
     * c
     */
    public double calcularResto()
    {
        double result;
        result = 0;
        
        result =  resto * zapatilla.calcularValorResto();
        
        return result;
    }
    
    /**
     * 
     */
    public void restar(Tenista oponente)//consideramos t2 como el tenista oponente
    {
        double incrementar;
        double resto;
        resto = calcularResto();
        
            if(resto > oponente.getGuardarPtoSaque()){
                incrementar = getPuntosAcumulados() + resto;
                setPuntosAcumulados(incrementar);
            }
     }
     
     /**
     * 
     */
    public void jugar(Tenista oponente)//consideramos t2 como el tenista oponente
    {
        sacar();
        //oponente.restar();
    }
}
    
    
  
