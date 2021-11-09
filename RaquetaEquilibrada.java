
/**
 * Write a description of class RaquetaEquilibrada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaEquilibrada extends RaquetaGenerica
{
    /**
     * Constructor for objects of class RaquetaEquilibrada
     * 
     * @param String model, Double pes, Double longi, Double tamano, Encordado estilo son los parametros necesarios para 
     * iniciar el constructor de la clase Raqueta Equilibrada el cual hace una llamada al super tipo Raqueta Generica
     */
    public RaquetaEquilibrada(String model, Double pes, Double longi, Double tamano, Encordado estilo)
    {
        super(model,pes,longi,tamano,estilo);
    }
}
