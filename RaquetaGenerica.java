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
    
    public void setModelo (String modelo)
    {
        this.modelo = modelo;
    }
    
    public String getModelo ()
    {
        return this.modelo;
    }
    
    public void setPeso (Double peso)
    {
        this.peso=peso;
    }
    
    public Double getPeso ()
    {
        return this.peso;
    }
    
     public void setLongitud (Double longitud)
    {
        this.longitud=longitud;
    }
    
    public Double getLongitud()
    {
        return this.longitud;
    }
    
     public void setTamanoDeLaCabeza (Double tamanoDeLaCabeza)
    {
        this.tamanoDeLaCabeza=tamanoDeLaCabeza;
    }
    
    public Double getTamanoDeLaCabeza()
    {
        return this.tamanoDeLaCabeza;
    }
    
    public void setEstiloDeEncordado (Encordado estiloDeEncordado)
    {
        this.estiloDeEncordado = estiloDeEncordado;
    }
    
    public String getEstiloDeEncordado()
    {
        return estiloDeEncordado.getEstilo();
    }
    
    public Encordado getEncordado()
    {
        return estiloDeEncordado;
    }
    
    @Override
    public String toString()
    {
        String cadena =" Raqueta [" + 
        "Modelo=" + modelo + "," + "Peso=" + peso + "," + "Longitud=" + longitud + ","
        + "tamanoDeLaCabeza=" + tamanoDeLaCabeza + "estiloDeEncordado=" + estiloDeEncordado.toString() + "]";
        
        return cadena;
    }
    
    
    public void iniciarMapaLongitudPotencia()
    {
        longitudPotencia.put(680.0, 2.0);
        longitudPotencia.put(690.0, 4.0);
        longitudPotencia.put(700.0, 6.0);
        longitudPotencia.put(720.0, 8.0);
        longitudPotencia.put(740.0, 10.0);
    }
    
    public void iniciarMapaTmCabControl()
    {
        tmCabControl.put(600.0,10.0);
        tmCabControl.put(630.0,8.0);
        tmCabControl.put(650.0,6.0);
        tmCabControl.put(680.0,4.0);
        tmCabControl.put(720.0,2.0);
    }
    
    public void iniciarMapaPesoVelocidad()
    {
        pesoVelocidad.put(220.0, 10.0);
        pesoVelocidad.put(260.0, 8.0);
        pesoVelocidad.put(300.0, 6.0);
        pesoVelocidad.put(320.0, 4.0);
        pesoVelocidad.put(340.0, 2.0);
    }
    
    
    public Double calcularPotencia()
    {
        return longitudPotencia.get( this.getLongitud() );
    }
    
    public Double calcularControl()
    {
        return tmCabControl.get( this.getTamanoDeLaCabeza() );
    }
    
    public Double calcularVelocidad()
    {
        return pesoVelocidad.get( this.getPeso() );
    }
}
