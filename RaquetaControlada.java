
/**
 * Write a description of class RaquetaControlada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaControlada extends RaquetaGenerica
{
    /**
     * Constructor for objects of class RaquetaControlada
     * 
     * @param String model, Double pes, Double longi, Double tamano, Encordado estilo son los parametros necesarios para 
     * iniciar el constructor de la clase Raqueta Controlada el cual hace una llamada al super tipo Raqueta Generica
     */
    public RaquetaControlada(String model, Double pes, Double longi, Double tamano, Encordado estilo)
    {
        super(model,pes,longi,tamano,estilo);
    }
    
    /**
     * Calcula el control de la Raqueta Controlada dependiendo si tenemos un tipo de Raqueta Controlada con Encordado ABIERTO o CERRADO.
     * Para ello sobreescribe el metodo calcularPotencia() del supertipo RaquetaGenerica
     * 
     * El cálculo del control será el calculado por defecto por cualquier raqueta multiplicado por el 
     * multiplicador de control asociado al tipo de encordado que use la raqueta 
     * 
     * @return Double result: resultado de las operaciones realizadas segun el tipo de encordado de la raqueta
     */
    @Override
    public Double calcularControl()
    {
        Encordado aux = null;
        Double result = 0.0;       
        Double j = super.calcularControl(); //obtengo la ponetencia
        
        aux = super.getEncordado();     //obtengo el encordado de la raqueta
        
        //veo si es de tipo ABIERTO
        if(super.getEstiloDeEncordado().equals("ABIERTO")){
            result = j * aux.getMultiplicadorDeControl(); //multiplicado por 2.2
        }
        else{   //si no es de tipo ABIERTO
            result = j * aux.getMultiplicadorDeControl(); //multiplicado por 2.5
        }
      
        return result;
    }
    
    /**
     * Calcula la velocidad de la Raqueta Controlada.
     * 
     * @reutrn se devuelve la velocidad obtenida supertipo Raqueta Generica multiplicada por la constante FACTOR2;
     */
    @Override
    public Double calcularVelocidad()
    {
        return super.calcularVelocidad() * super.FACTOR2;
    }
}
