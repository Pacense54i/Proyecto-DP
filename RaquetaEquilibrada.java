
/**
 * Write a description of class RaquetaEquilibrada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaEquilibrada extends RaquetaGenerica
{
    private double multiplicadorPotencia;
    private double multiplicadorControl;
    
    
    /**
     * Constructor for objects of class RaquetaEquilibrada
     * 
     * @param String model, double pes, double longi, double tamano, Encordado estilo, double multiplicadorPotenci, double multiplicadorContro
     * son los parametros necesarios para iniciar el constructor 
     * de la clase Raqueta Equilibrada el cual hace una llamada al super tipo Raqueta Generica
     */
    public RaquetaEquilibrada(String model, double pes, double longi, double tamano, Encordado estilo, double multiplicadorPotenci, double multiplicadorContro)
    {
        super(model,pes,longi,tamano,estilo);
        multiplicadorPotencia = multiplicadorPotenci; 
        multiplicadorControl = multiplicadorContro;
    }
    
    /**
     * Set multiplicadorPotenci para especificar el multiplicadorPotencia de la Raqueta Equilibrada
     * 
     * @param double multiplicadorPotenci: introduce el valor introducido por parametro en la variable multiplicadorPotencia de la Raqueta.
     */
     public void setMultiplicadorPotencia (double multiplicadorPotenci)
    {
        this.multiplicadorPotencia=multiplicadorPotenci;
    }
    
    /**
     * Devuelve el multiplicadorPotencia actual de la Raqueta Equilibrada
     * 
     * @return devuelve el valor del atributo multiplicadorPotencia(double) de la clase Raqueta Equilibrada
     */
    public double getMultiplicadorPotencia()
    {
        return this.multiplicadorPotencia;
    }
    
    /**
     * Set multiplicadorContro para especificar el multiplicadorControl de la Raqueta Equilibrada
     * 
     * @param double multiplicadorContro: introduce el valor introducido por parametro en la variable multiplicadorControl de la Raqueta.
     */
     public void setMultiplicadorControl(double multiplicadorContro)
    {
        this.multiplicadorControl=multiplicadorContro;
    }
    
     /**
     * Devuelve el multiplicadorControl actual de la Raqueta Equilibrada
     * 
     * @return devuelve el valor del atributo multiplicadorControl(double) de la clase Raqueta Equilibrada
     */
    public double getMultiplicadorControl()
    {
        return this.multiplicadorControl;
    }
    
    
    /**
     *  Calcula la potencia de la Raqueta Equilibrada.
     * 
     * @reutrn se devuelve la potencia obtenida del supertipo Raqueta Generica multiplicado 
     * por el multiplicador de potencia de la clase Raqueta Equilibrada;
     */
    @Override
    public Double calcularPotencia()
    {
        return super.calcularPotencia() * this.getMultiplicadorPotencia();
    }
    
    /**
     * Calcula el control de la Raqueta Equilibrada.
     * 
     * @reutrn se devuelve el control obtenido del supertipo Raqueta Generica multiplicado 
     * por el multiplicador de control de la clase Raqueta Equilibrada;
     */
    @Override
    public Double calcularControl()
    {
        return super.calcularControl() * this.getMultiplicadorControl();
    }
}
