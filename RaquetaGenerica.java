
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
    
    /**
     * Set model para especificar el modelo de la Raqueta
     * 
     * @param String model: modelo de la Raqueta.
     */
    public void setModelo (String modelo)
    {
        this.modelo = modelo;
    }
    
    /**
     * Devuelve el modelo actual de la Raqueta
     * 
     * @return devuelve el valor de la varible modelo(String)
     */
    public String getModelo ()
    {
        return this.modelo;
    }
    
    /**
     * Set peso para especificar el peso de la Raqueta
     * 
     * @param double peso: peso de la Raqueta.
     */
    public void setPeso (double peso)
    {
        this.peso=peso;
    }
    
    /**
     * Devuelve el peso actual de la Raqueta
     * 
     * @return devuelve el valor de la varible peso(double)
     */
    public double getPeso ()
    {
        return this.peso;
    }
    
    /**
     * Set longitud para especificar el longitud de la Raqueta
     * 
     * @param double longitud: longitud de la Raqueta.
     */
     public void setLongitud (double longitud)
    {
        this.longitud=longitud;
    }
    
    /**
     * Devuelve la longitud actual de la Raqueta
     * 
     * @return devuelve el valor de la varible longitud(double)
     */
    public double getLongitud()
    {
        return this.longitud;
    }
    
    /**
     * Set tamanoDeLaCabeza para especificar el tamanoDeLaCabeza de la Raqueta
     * 
     * @param double tamanoDeLaCabeza: tamanoDeLaCabeza de la Raqueta.
     */
     public void setTamanoDeLaCabeza (double tamanoDeLaCabeza)
    {
        this.tamanoDeLaCabeza=tamanoDeLaCabeza;
    }
    
    /**
     * Devuelve la tamanoDeLaCabeza actual de la Raqueta
     * 
     * @return devuelve el valor de la varible tamanoDeLaCabeza(double)
     */
    public double getTamanoDeLaCabeza()
    {
        return this.tamanoDeLaCabeza;
    }
    
    /**
     * Set estiloDeEncordado para especificar el estiloDeEncordado de la Raqueta
     * 
     * @param String estiloDeEncordado: estiloDeEncordado de la Raqueta.
     */
    public void setEstiloDeEncordado (String estiloDeEncordado)
    {
        this.estiloDeEncordado=estiloDeEncordado;
    }
    
    /**
     * Devuelve la estiloDeEncordado actual de la Raqueta
     * 
     * @return devuelve el valor de la varible estiloDeEncordado(String)
     */
    public String getEstiloDeEncordado()
    {
        return this.estiloDeEncordado;
    }
    
    /**
     * Muestra en pantalla los valores de la diferentes variables de la clase Zapatillas
     * 
     *Con @Override se sobreescribe el metodo toString de la clase Object
     */
    @Override
    public String toString()
    {
        String cadena =" Raqueta [" + 
        "Modelo=" + modelo + "," + "Peso=" + peso + "," + "Longitud=" + longitud + ","
        + "tamanoDeLaCabeza=" + tamanoDeLaCabeza + "estiloDeEncordado=" + estiloDeEncordado + "]";
        
        return cadena;
    }
}
