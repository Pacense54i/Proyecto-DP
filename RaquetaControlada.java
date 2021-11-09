
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
}
