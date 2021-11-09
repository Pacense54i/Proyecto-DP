import java.util.Map;
import java.util.HashMap;

/**
 * Write a description of class RaquetaGenerica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaGenerica implements InterfaceRaqueta
{
    private String modelo;
    private Double peso;
    private Double longitud;
    private Double tamanoDeLaCabeza;
    
    private Encordado estiloDeEncordado;
    
    Map <Double, Double > longitudPotencia = new HashMap<>();
    Map <Double, Double > tmCabControl = new HashMap<>();
    Map <Double, Double > pesoVelocidad = new HashMap<>();
    
    public final Double FACTOR1 = 1.5;
    public final Double FACTOR2 = 1.2;
    
    /**
     * Constructor de la Raqueta Generica.
     */
    public RaquetaGenerica()
    {
        modelo= "";
        peso=0.0;
        longitud=0.0;
        tamanoDeLaCabeza=0.0;
        estiloDeEncordado= null; //preguntar si estaria bien
        
        longitudPotencia = new HashMap<>();
        tmCabControl = new HashMap<>();
        pesoVelocidad = new HashMap<>();
    }
    
    /**
     * Constructor parametrizado de la Raqueta Generica.
     */
    public RaquetaGenerica(String model, Double pes, Double longi, Double tamano, Encordado estilo)
    {
        modelo = model;
        peso = pes;
        longitud = longi;
        tamanoDeLaCabeza = tamano;
        estiloDeEncordado = estilo;
        
        longitudPotencia = new HashMap<>();
        tmCabControl = new HashMap<>();
        pesoVelocidad = new HashMap<>();
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
    public void setPeso (Double peso)
    {
        this.peso=peso;
    }
    
    /**
     * Devuelve el peso actual de la Raqueta
     * 
     * @return devuelve el valor de la varible peso(Double)
     */
    public Double getPeso ()
    {
        return this.peso;
    }
    
    /**
     * Set longitud para especificar el longitud de la Raqueta
     * 
     * @param Double longitud: longitud de la Raqueta.
     */
     public void setLongitud (Double longitud)
    {
        this.longitud=longitud;
    }
    
    /**
     * Devuelve la longitud actual de la Raqueta
     * 
     * @return devuelve el valor de la varible longitud(double)
     */
    public Double getLongitud()
    {
        return this.longitud;
    }
    
    /**
     * Set tamanoDeLaCabeza para especificar el tamanoDeLaCabeza de la Raqueta
     * 
     * @param Double tamanoDeLaCabeza: tamanoDeLaCabeza de la Raqueta.
     */
     public void setTamanoDeLaCabeza (Double tamanoDeLaCabeza)
    {
        this.tamanoDeLaCabeza=tamanoDeLaCabeza;
    }
    
    /**
     * Devuelve la tamanoDeLaCabeza actual de la Raqueta
     * 
     * @return devuelve el valor de la varible tamanoDeLaCabeza(Double)
     */
    public Double getTamanoDeLaCabeza()
    {
        return this.tamanoDeLaCabeza;
    }
    
    /**
     * Set estiloDeEncordado para especificar el estiloDeEncordado de la Raqueta
     * 
     * @param Encordado (objeto de tipo ENUM) estiloDeEncordado: atributo estiloDeEncordado de la Raqueta.
     */
    public void setEstiloDeEncordado (Encordado estiloDeEncordado)
    {
        this.estiloDeEncordado = estiloDeEncordado;
    }
    
    /**
     * Devuelve el estiloDeEncordado actual de la Raqueta 
     * Puede ser : ABIERTO o CERRADO
     * 
     * @return devuelve el tipo de encordado de la raqueta almacenado en la variable estiloDeEncordado de tipo Encordado (ENUM)
     */
    public String getEstiloDeEncordado()
    {
        return estiloDeEncordado.getEstilo();
    }
    
    /**
     * Metodo usado para obtener el Encordado de la variable estiloDeEncordado de la clase RaquetaGenerica
     * 
     * @return devuelve el objeto Encordado(ENUM) de la variable estiloDeEncordado de la Raqueta
     */
    public Encordado getEncordado()
    {
        return estiloDeEncordado;
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
        + "tamanoDeLaCabeza=" + tamanoDeLaCabeza + "estiloDeEncordado=" + estiloDeEncordado.toString() + "]";
        
        return cadena;
    }
    
    /**
     * Se introduce los hashMaps con los diferentes valores segun las tablas proporcionadas por los profesores
     * 
     * Las raquetas con menos peso ofrecen una mayor velocidad, o las raquetas con una cabeza mayor ofrecen más potencia pero menos contro
     */
    public void iniciarHashMap()
    {
        longitudPotencia.put(680.0, 2.0);
        longitudPotencia.put(690.0, 4.0);
        longitudPotencia.put(700.0, 6.0);
        longitudPotencia.put(720.0, 8.0);
        longitudPotencia.put(740.0, 10.0);
        
        tmCabControl.put(600.0,10.0);
        tmCabControl.put(630.0,8.0);
        tmCabControl.put(650.0,6.0);
        tmCabControl.put(680.0,4.0);
        tmCabControl.put(720.0,2.0);
        
        pesoVelocidad.put(220.0, 10.0);
        pesoVelocidad.put(260.0, 8.0);
        pesoVelocidad.put(300.0, 6.0);
        pesoVelocidad.put(320.0, 4.0);
        pesoVelocidad.put(340.0, 2.0);
        
    }
    
    /**
     * 
     */
    public Double calcularPotencia()
    {
        return longitudPotencia.get( this.getLongitud() );
    }
    
    /**
     * 
     */
    public Double calcularControl()
    {
        return tmCabControl.get( this.getTamanoDeLaCabeza() );
    }
    
    /**
     * 
     */
    public Double calcularVelocidad()
    {
        return pesoVelocidad.get( this.getPeso() );
    }
}
