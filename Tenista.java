
/**
 * Write a description of class Tenista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tenista
{
    // instance variables - replace the example below with your own
    private int saque;
    private int resto;
    private int ranking;
    private int puntosAcumulados;
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
    public void setSaque(int saque1)
    {
        saque = saque1;
    }
    
    /**
     * Return the current saque
     */
    public int getSaque()
    {
        return saque;
    }
    
    
    /**
     * Set rest to specify the resto of the Tenista
     */
    public void setResto(int rest)
    {
        resto = rest;
    }
    
    /**
     * Return the current resto
     */
    public int getResto()
    {
        return resto;
    }
    
    
    /**
     * Set rankin to specify the ranking of the Tenista
     */
    public void setRanking(int rankin)
    {
        ranking = rankin;
    }
    
    /**
     * Return the current ranking
     */
    public int getRanking()
    {
        return ranking;
    }
    
    
    /**
     * Set ptoAcumulados to specify the puntosAcumulados of the Tenista
     */
    public void setPuntosAcumulados(int ptoAcumulados)
    {
        puntosAcumulados = ptoAcumulados;
    }
    
    /**
     * Return the current puntosAcumulados
     */
    public int getPuntosAcumulados()
    {
       return puntosAcumulados;
    }
    
    
    /**
     * Set name to specify the nombre of the Tenista
     */
    public void setNombre(String name)
    {
        nombre = name;
    }
    
    /**
     * Return the current nombre
     */
    public String getNombre()
    {
       return nombre;
    }
    
    
    /**
     * Set country to specify the pais of the Tenista
     */
    public void setPais(String country)
    {
        pais = country;
    }
    
    /**
     * Return the current nombre
     */
    public String getPais()
    {
       return pais;
    }
    
    
    /**
     * Set calzado to specify the zapatilla of the Tenista
     */
    public void setZapatilla(Zapatillas calzado)
    {
        zapatilla = calzado;
    }
    
    /**
     * Return the current zapatilla
     */
    public Zapatillas getZapatilla()
    {
       return zapatilla;
    }
    
    
    /**
     * c
     */
    public int calcularSaque()
    {
        int result;
        result = 0;
        
        result =  saque * zapatilla.calcularValorSaque();
        
        return result;
    }
    
    /**
     * Poner la pelota en juego
     */
    public int sacar(Tenista oponente)
    {
        int increment;
        increment = 0;
        
        increment = puntosAcumulados + calcularSaque();
        
        return increment;
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
    public void restar(Tenista t1, Tenista t2)//consideramos t2 como el tenista oponente
    {
        double restoT2;
        int saqueT1;
        restoT2 = t2.calcularResto();
        saqueT1 = t1.calcularSaque();
        
        if(restoT2 > saqueT1){
            t2.puntosAcumulados += restoT2;
        }
    }
    
    /**
     * 
     */
    public void jugar(Tenista t1, Tenista t2)//consideramos t2 como el tenista oponente
    {
        sacar(t2);
        restar(t1,t2);
    }
}
