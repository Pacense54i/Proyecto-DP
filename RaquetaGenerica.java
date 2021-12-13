import java.util.Map;
import java.util.HashMap;

/**
 * Write a description of class RaquetaGenerica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaGenerica implements InterfaceRaqueta, InterfaceRaqueta2
{
    private String modelo;
    private double peso;
    private double longitud;
    private double tamanoDeLaCabeza;
    
    private Encordado estiloDeEncordado;
    
    // Jose dice que deben ser estaticos pues si en un futuro
    // cambias algo, sólo se cambiaría en una de las raquetas
    // y no en todas.
    // Le extraña mucho que no nos hayan dicho nada la verdad.
    Map <Double, Double > longitudPotencia = new HashMap<>();
    Map <Double, Double > tmCabControl = new HashMap<>();
    Map <Double, Double > pesoVelocidad = new HashMap<>();
    
    public final double FACTOR1 = 1.5;
    public final double FACTOR2 = 1.2;
    
    /**
     * Constructor de la Raqueta Generica.
     */
    public RaquetaGenerica()
    {
        modelo= "";
        peso=0.0;
        longitud=0.0;
        tamanoDeLaCabeza=0.0;
        estiloDeEncordado= null; 
        
        
        longitudPotencia = new HashMap<>();
        iniciarMapaLongitudPotencia();
        
        tmCabControl = new HashMap<>();
        iniciarMapaTmCabControl();
        
        pesoVelocidad = new HashMap<>();
        iniciarMapaPesoVelocidad();
    }
    
    /**
     * Constructor parametrizado de la Raqueta Generica.
     */
    public RaquetaGenerica(String model, double pes, double longi, double tamano, Encordado estilo)
    {
        modelo = model;
        peso = pes;
        longitud = longi;
        tamanoDeLaCabeza = tamano;
        estiloDeEncordado = estilo;
        
        
        longitudPotencia = new HashMap<>();
        iniciarMapaLongitudPotencia();
        
        tmCabControl = new HashMap<>();
        iniciarMapaTmCabControl();
        
        pesoVelocidad = new HashMap<>();
        iniciarMapaPesoVelocidad();
    }
    
    public void setModelo (String modelo)
    {
        this.modelo = modelo;
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
        String cadena2 ="\n     [modelo: " + getModelo();
        String cadena3 ="\n     longuitud: " + getLongitud() + ",potencia asociada: " + calcularPotencia();
        String cadena4 ="\n     tamaño: " + getTamanoDeLaCabeza() + ",control asociado: " + calcularControl();
        String cadena5 ="\n     peso: " + getPeso() + ",velocidad asociada: " + calcularVelocidad() + "]";
        
        return cadena2 + cadena3 + cadena4 + cadena5;
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
    
    
    public double calcularPotencia()
    {
        return longitudPotencia.get(this.getLongitud());
    }
    
    public double calcularControl()
    {
        return tmCabControl.get( this.getTamanoDeLaCabeza() );
    }
    
    public double calcularVelocidad()
    {
        return pesoVelocidad.get( this.getPeso() );
    }
}
