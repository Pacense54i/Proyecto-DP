
/**
 * Write a description of class RaquetaGenerica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaGenerica implements InterfaceRaqueta
{
    private String modelo;
    private double peso;
    private double longitud;
    private double tamanoDeLaCabeza;
    private String estiloDeEncordado;
    
    /**
     * Constructor de la Raqueta Generica.
     */
    public RaquetaGenerica()
    {
        modelo= "";
        peso=0.0;
        longitud=0.0;
        tamanoDeLaCabeza=0.0;
        estiloDeEncordado="";
    }
    
    /**
     * Constructor parametrizado de la Raqueta Generica.
     */
    public RaquetaGenerica(String model, double pes, double longi, double tamano, String estilo)
    {
        modelo = modelo;
        peso = peso;
        longitud = longi;
        tamanoDeLaCabeza = tamano;
        estiloDeEncordado = estilo;
    }
    
    public void setModelo (String modelo)
    {
        this.modelo=modelo;
    }
    
    public String getModelo ()
    {
        return this.modelo;
    }
    
    public void setPeso (double peso)
    {
        this.peso=peso;
    }
    
    public double getPeso ()
    {
        return this.peso;
    }
    
     public void setLongitud (double longitud)
    {
        this.longitud=longitud;
    }
    
    public double getLongitud()
    {
        return this.longitud;
    }
    
     public void setTamanoDeLaCabeza (double tamanoDeLaCabeza)
    {
        this.tamanoDeLaCabeza=tamanoDeLaCabeza;
    }
    
    public double getTamanoDeLaCabeza()
    {
        return this.tamanoDeLaCabeza;
    }
    
    public void setEstiloDeEncordado (String estiloDeEncordado)
    {
        this.estiloDeEncordado=estiloDeEncordado;
    }
    
    public String getEstiloDeEncordado()
    {
        return this.estiloDeEncordado;
    }
    
    
}
